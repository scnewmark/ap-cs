package Labs.Hearts;

import java.util.ArrayList;

public final class Deck {
    private final String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
    private final String[] suits = {"clubs", "spades", "hearts", "diamonds"};
    private final int[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    private final ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() { this.initializeDeck(); }

    public void initializeDeck() {
        for (int suitIndex = 0; suitIndex < 4; suitIndex++) {
            for (int cardIndex = 0; cardIndex < 13; cardIndex++) {
                this.deck.add(new Card(this.names[cardIndex], this.suits[suitIndex], this.ranks[cardIndex]));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return this.deck; 
    }

    public Card getCard(final int index) { 
        return this.deck.get(index); 
    }

    public Card dealTopCard() {
        final Card card = this.deck.get(0);
        this.deck.remove(card);
        return card;
    }

    public void shuffle() {
        for (int i = 0; i < 20; i++) {
            final int numToShuffle = 2 + (int)(Math.random() * ((10 - 2) + 1));
            final int insertionIndex = 0 + (int)(Math.random() * ((40 - 0) + 1));
            final ArrayList<Card> toShuffle = new ArrayList<Card>();
            for (int j = 0; j < numToShuffle; j++) {
                toShuffle.add(this.dealTopCard());
            }
            this.deck.addAll(insertionIndex, toShuffle);
        }
    }

    @Override
    public String toString() {
        if (this.deck.size() < 1) return "No cards in the deck!";
        final StringBuilder builder = new StringBuilder();
        for (final Card c : this.deck) builder.append(c);
        return builder.toString();
    }
}
