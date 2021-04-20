package com.labs.hearts;

import java.util.ArrayList;

public class CardPlayerTest {
    public static void main(String[] args) {
        final CardPlayer cp1 = new CardPlayer("Kara Jones", 0, new ArrayList<Card>());
        System.out.printf("\nNew CardPlayer -> %s\n", cp1.toString());

        cp1.addCard(new Card("3", "diamonds", 3));
        cp1.addCard(new Card("A", "hearts", 14));
        cp1.addCard(new Card("6", "spades", 6));
        cp1.addCard(new Card("7", "spades", 7));
        cp1.addCard(new Card("2", "clubs", 2));
        cp1.addCard(new Card("3", "clubs", 3));
        System.out.printf("After adding 6 specific cards. Player -> %s\n", cp1.toString());

        cp1.getHand().remove(5);
        System.out.println("---- skipped step ----");

        cp1.updateScore(27);
        System.out.printf("Updated score to %d points\n", cp1.getScore());
        System.out.printf("Player -> %s\n", cp1.toString());

        System.out.printf("Cards played in round -> %s\n", new ArrayList<Card>().toString());
        System.out.printf("Cards played in game -> %s\n", new ArrayList<Card>().toString());

        final Card c1 = cp1.chooseCard(new ArrayList<Card>(), new ArrayList<Card>());
        System.out.printf("Chose 2 of clubs -> %s\n", c1.toString());
        System.out.printf("Player -> %s\n", cp1.toString());

        final ArrayList<Card> r1 = new ArrayList<Card>();
        r1.add(new Card("10", "spades", 10));
        System.out.printf("Cards played in round -> %s\n", r1.toString());

        final Card c2 = cp1.chooseCard(r1, new ArrayList<Card>());
        System.out.printf("Randomly chosen spade -> %s ", c2.toString());
        System.out.printf("Player -> %s\n", cp1.toString());

        final ArrayList<Card> r2 = new ArrayList<Card>();
        r2.add(new Card("9", "clubs", 9));
        System.out.printf("Cards played in round -> %s\n", r2.toString());

        final Card c3 = cp1.chooseCard(r2, new ArrayList<Card>());
        System.out.printf("Heart chosen -> %s ", c3.toString());
        System.out.printf("Player -> %s\n", cp1.toString());

        final ArrayList<Card> r3 = new ArrayList<Card>();
        System.out.printf("Cards played in round -> %s\n", r3.toString());
        final Card c4 = cp1.chooseCard(r3, new ArrayList<Card>());
        System.out.printf("Randomly chosen card -> %s ", c4.toString());
        System.out.printf("Player -> %s\n", cp1.toString());
    }
}
