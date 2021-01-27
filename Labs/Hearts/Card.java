package Labs.Hearts;

public final class Card implements Comparable<Object> {
    private String name;
    private String suit;
    private int rank;

    public Card() {
        this.name = "default";
        this.suit = "default";
        this.rank = 0;
    }

    public Card(final String n, final String s, final int r) {
        this.name = n;
        this.suit = s;
        this.rank = r;
    }

    // Accessors
    public String getName() { return this.name; }
    public String getSuit() { return this.suit; }
    public int getRank() { return this.rank; }

    // Modifiers
    public void setName(final String n) { this.name = n; }
    public void setSuit(final String s) { this.suit = s; }
    public void setRank(final int r) { this.rank = r; }

    public int sortRank() {
        return suit == "diamonds" ? rank + 0 : suit == "hearts" ? rank + 13 : suit == "spades" ? rank + 26 : rank + 39;
    }

    @Override
    public boolean equals(final Object o) {
        final Card card = (Card) o;
        return card.getName().equals(this.name) && card.sortRank() == this.sortRank() && card.getSuit().equals(this.suit);
    }

    @Override
    public int compareTo(final Object o) {
        final Card card = (Card) o;
        if (this.sortRank() > card.sortRank()) { return 1; }
        if (this.sortRank() < card.sortRank()) { return -1; }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s%s(%d)", this.suit.charAt(0), this.name.charAt(0), this.rank);
    }
}