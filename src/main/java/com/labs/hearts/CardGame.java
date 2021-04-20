package com.labs.hearts;

import java.util.ArrayList;
import java.util.Comparator;

public class CardGame {
    private Deck deckOfCards;
    private String nameOfGame;
    private ArrayList<CardPlayer> players;
    private int numberOfPlayers;
    private int currentPlayer;

    public CardGame(final String nameOfGame, final int playerCount, final String[] playerNames, final int currentPlayer) {
        this.players = new ArrayList<CardPlayer>();
        this.deckOfCards = new Deck();

        this.nameOfGame = nameOfGame;
        this.numberOfPlayers = playerCount;
        this.currentPlayer = currentPlayer;

        this.players.add(new CardPlayerSamNewmark("Sam", 0, new ArrayList<Card>()));
        this.players.add(new CardPlayer("Beth", 0, new ArrayList<Card>()));
        this.players.add(new CardPlayer("Steve", 0, new ArrayList<Card>()));
        this.players.add(new CardPlayer("Lanie", 0, new ArrayList<Card>()));
    }

    // Accessors
    public Deck getDeckOfCards() { return this.deckOfCards; }
    public String getNameOfGame() { return this.nameOfGame; }
    public CardPlayer getPlayer(final int i) { return this.players.get(i); }
    public ArrayList<CardPlayer> getPlayers() { return this.players; }
    public int getNumberOfPlayers() { return this.numberOfPlayers; }
    public int getCurrentPlayer() { return this.currentPlayer; }

    // Modifiers
    public void setDeckOfCards(final Deck deck) { this.deckOfCards = deck; }
    public void setNameOfGame(final String name) { this.nameOfGame = name; }
    public void setPlayers(final ArrayList<CardPlayer> players) { this.players = players; }
    public void setNumberOfPlayers(final int num) { this.numberOfPlayers = num; }
    public void setCurrentPlayer(final int index) { this.currentPlayer = index; }

    public void deal(final int cardCount, final int index) {
        for (int dealt = 0; dealt < cardCount; dealt++) {
            final Card c = this.deckOfCards.dealTopCard();
            this.players.get(index).addCard(c);
        }
    }

    public void playGame() {
        this.setStartingPlayer();

        final ArrayList<Card> game = new ArrayList<Card>();

        for (int i = 0; i < 13; i++) {
            final ArrayList<Card> round = new ArrayList<Card>();

            final int startingPlayer = this.currentPlayer;
            for (int k = 0; k < 4; k++) {
                final CardPlayer player = this.players.get(this.currentPlayer);
                final Card c = player.chooseCard(round, game);
                round.add(c);

                if (this.currentPlayer == this.players.size() - 1) {
                    this.setCurrentPlayer(0);
                    continue;
                }

                this.setCurrentPlayer(this.currentPlayer + 1);
            }

            final int takes = this.takesRound(startingPlayer, new ArrayList<Card>(round));
            this.players.get(takes).getTakenCards().addAll(round);
            game.addAll(round);

            this.checkRound(round, startingPlayer);
            this.setCurrentPlayer(takes);
        }

        this.calculateScores();
    }

    private int takesRound(final int lead, final ArrayList<Card> round) {
        final ArrayList<Card> pre = new ArrayList<Card>(round);

        round.removeIf(c -> c.getSuit() != round.get(0).getSuit());
        round.sort(Comparator.reverseOrder());

        final Card highest = round.get(0);
        final int turn = pre.indexOf(highest);

        return (lead + turn) % 4;
    }

    private void calculateScores() {
        final Card queenOfSpades = new Card("Q", "spades", 12);
        for (final CardPlayer cp : this.players) {
            final ArrayList<Card> cards = cp.getTakenCards();

            cards.removeIf(card -> card.getSuit() != "hearts" && !card.equals(queenOfSpades));

            if (cards.contains(queenOfSpades)) {
                cp.updateScore(13);
                cp.updateScore(cards.size() - 1);
                continue;
            }

            cp.updateScore(cards.size());
        }
    }

    public void checkRound(ArrayList<Card> round, int startingPlayer) {
        String roundSuit = round.get(0).getSuit(); 
        for (int i = 1; i < round.size(); i++) { 
            if (!round.get(i).getSuit().equals(roundSuit)) { 
                CardPlayer player = this.players.get((i + startingPlayer) % round.size());
                for (Card c : player.getHand()) {
                    if (c.getSuit().equals(roundSuit)) { 
                        System.out.println("*** INCORRECT ***" + player.getName() + " playing " + round.get(i) + " in " + round + " while having " + player.getHand());
                        System.exit(1);
                    }
                }
            }
        }
    }

    private void setStartingPlayer() {
        for (int i = 0; i < this.players.size(); i++) {
            for (final Card c : this.players.get(i).getHand()) {
                if (c.getSuit() == "clubs" && c.getName() == "2" && c.getRank() == 2) {
                    this.setCurrentPlayer(i);
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("***%s***\n", this.nameOfGame));
        for (final CardPlayer cp : this.players) {
            builder.append(cp + "\n");
        }
        builder.append(String.format("deck -> %s...", this.deckOfCards.toString().substring(0, 52)));
        return builder.toString();
    }
}
