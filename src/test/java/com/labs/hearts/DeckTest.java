package com.labs.hearts;

public class DeckTest {
	public static void main(String[] args) {
		System.out.println("\nnew Deck()");
		final Deck deck = new Deck();
		System.out.println(deck + "\n");

		System.out.println("Shuffle() method");
		deck.shuffle();
		System.out.println(deck + "\n");

		System.out.println("Dealing Cards...");
		for (int i = 0; i < 4; i++) {
			System.out.println(String.format("Round %d (%d cards remaining)", i + 1, deck.getDeck().size()));
			for (int j = 0; j < 13; j++) {
				final Card dealt = deck.dealTopCard();
				System.out.print(dealt);
			}
			System.out.println("\n" + deck);

			System.out.println("\n");
		}

		final Deck s = new Deck(); s.shuffle();
		final Card test = s.dealTopCard();
		System.out.println(String.format("random card from new deck is %s", test.toString()));
		final int location = (int)(Math.random() * ((51 - 0) + 1));
		System.out.println(String.format("random location to check is %d", location));
		int times = 0;
		for (int k = 0; k < 52000; k++) {
			final Deck d = new Deck();
			d.shuffle();
			if (d.getCard(location).equals(test)) times++;
		}
		System.out.println(String.format("Found %s at location %d in the deck %d times out of 52000 shuffles", test.toString(), location, times));
	}
}
