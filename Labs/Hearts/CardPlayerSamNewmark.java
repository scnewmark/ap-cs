package Labs.Hearts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CardPlayerSamNewmark extends CardPlayer {

    public CardPlayerSamNewmark(final String n, final int s, final ArrayList<Card> h) {
        super(n, s, h);
    }

    @Override
    public Card chooseCard(final ArrayList<Card> r, final ArrayList<Card> g) {
        final Card twoOfClubs = new Card("2", "clubs", 2);
        final Card queenOfSpades = new Card("Q", "spades", 12);

        if (this.getHand().contains(twoOfClubs)) { this.getHand().remove(twoOfClubs); return twoOfClubs; }

        if (r.isEmpty()) {
            this.getHand().sort(Comparator.naturalOrder());
            final Card c = this.getHand().get(0); this.getHand().remove(c);
            return c;
        }

        final Card firstRoundCard = r.get(0);

        final List<Card> sameSuit = this.getHand().stream().filter(c -> c.getSuit() == firstRoundCard.getSuit()).collect(Collectors.toList());
        final List<Card> hearts = this.getHand().stream().filter(c -> c.getSuit() == "hearts").collect(Collectors.toList());

        if (sameSuit.size() > 0) {
            sameSuit.sort(Comparator.naturalOrder());
            final Card c = sameSuit.get(0); this.getHand().remove(c);
            return c;
        }

        if (this.getHand().contains(queenOfSpades)) { this.getHand().remove(queenOfSpades); return queenOfSpades; }

        if (hearts.size() > 0) {
            hearts.sort(Comparator.reverseOrder());
            final Card c = hearts.get(0); this.getHand().remove(c);
            return c;
        }

        this.getHand().sort(Comparator.reverseOrder());
        final Card c = this.getHand().get(0); this.getHand().remove(c);
        return c;
    }
}
