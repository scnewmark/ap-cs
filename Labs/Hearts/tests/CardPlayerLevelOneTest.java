package Labs.Hearts.tests;

import java.util.ArrayList;

import Labs.Hearts.Card;
import Labs.Hearts.CardPlayerLevelOne;
import Labs.Hearts.Deck;

public class CardPlayerLevelOneTest {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        final CardPlayerLevelOne cp1 = new CardPlayerLevelOne("Player 1", 0, new ArrayList<Card>());
        final CardPlayerLevelOne cp2 = new CardPlayerLevelOne("Player 2", 0, new ArrayList<Card>());
        final CardPlayerLevelOne cp3 = new CardPlayerLevelOne("Player 3", 0, new ArrayList<Card>());
        final CardPlayerLevelOne cp4 = new CardPlayerLevelOne("Player 4", 0, new ArrayList<Card>());
        
        final Deck deck = new Deck();
        deck.shuffle();

        for (int j = 0; j < 13; j++) {
            final Card c = deck.dealTopCard();
            cp1.addCard(c);
        }

        for (int j = 0; j < 13; j++) {
            final Card c = deck.dealTopCard();
            cp2.addCard(c);
        }

        for (int j = 0; j < 13; j++) {
            final Card c = deck.dealTopCard();
            cp3.addCard(c);
        }

        for (int j = 0; j < 13; j++) {
            final Card c = deck.dealTopCard();
            cp4.addCard(c);
        }

        ArrayList<Card> round = new ArrayList<Card>();
        ArrayList<Card> game = new ArrayList<Card>();

        System.out.println("Cards played in round --> " + round);
        System.out.println("Cards in hand --> " + cp1.getHand());
        Card c = cp1.chooseCard(round, game);
        round.add(c);
        System.out.println("Chosen card --> " + c);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Cards played in round --> " + round);
        System.out.println("Cards in hand --> " + cp1.getHand());
        c = cp2.chooseCard(round, game);
        round.add(c);
        System.out.println("Chosen card --> " + c);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Cards played in round --> " + round);
        System.out.println("Cards in hand --> " + cp1.getHand());
        c = cp3.chooseCard(round, game);
        round.add(c);
        System.out.println("Chosen card --> " + c);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Cards played in round --> " + round);
        System.out.println("Cards in hand --> " + cp1.getHand());
        c = cp4.chooseCard(round, game);
        round.add(c);
        System.out.println("Chosen card --> " + c);

        System.out.println("-----------------------------------------------------------------------------");

        game.addAll(round);
        round = new ArrayList<Card>();
        System.out.println("Cards played in game --> " + game);
        System.out.println("Cards played in round -->" + round);
    }
}
