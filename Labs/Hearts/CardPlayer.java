package Labs.Hearts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardPlayer extends Player {
    private ArrayList<Card> hand;
    private ArrayList<Card> takenCards;

    public CardPlayer(final String n, final int s, final ArrayList<Card> h) {
        super(n, s);

        this.hand = h;
        this.takenCards = new ArrayList<Card>();
    }

    // Accessors
    public ArrayList<Card> getHand() { return this.hand; }
    public ArrayList<Card> getTakenCards() { return this.takenCards; }

    // Modifiers
    public void setHand(final ArrayList<Card> h) { this.hand = h; }
    public void setTakenCards(final ArrayList<Card> t) { this.takenCards = t; }

    public void addCard(final Card c) { this.hand.add(c); }

    public Card playCard(final int i) { 
        final Card c = this.hand.get(i);
        this.hand.remove(c);
        return c;
    }

    public Card chooseCard(final ArrayList<Card> r, final ArrayList<Card> g) {
        final Card twoOfClubs = new Card("2", "clubs", 2);
        if (this.hand.contains(twoOfClubs)) { this.hand.remove(twoOfClubs); return twoOfClubs; }

        if (r.isEmpty()) {
            final int i = (int) (Math.random() * ((this.hand.size() - 1) + 1));
            final Card c = this.hand.get(i); this.hand.remove(c);
            return c;
        }

        final Card firstRoundCard = r.get(0);

        final List<Card> sameSuit = this.hand.stream().filter(c -> c.getSuit() == firstRoundCard.getSuit()).collect(Collectors.toList());
        final List<Card> hearts = this.hand.stream().filter(c -> c.getSuit() == "hearts").collect(Collectors.toList());

        if (sameSuit.size() > 0) {
            final int i = (int) (Math.random() * ((sameSuit.size() - 1) + 1));
            final Card c = sameSuit.get(i); this.hand.remove(c);
            return c;
        }

        if (hearts.size() > 0) {
            final int i = (int) (Math.random() * ((hearts.size() - 1) + 1));
            final Card c = hearts.get(i); this.hand.remove(c);
            return c;
        }

        final int i = (int) (Math.random() * (this.hand.size() + 1));
        final Card c = this.hand.get(i); this.hand.remove(c);
        return c;
    }

    @Override
    public String toString() {
        Collections.sort(this.hand);
        return String.format("%s (%d) %s", this.getName(), this.getScore(), this.hand.toString());
    }
}
