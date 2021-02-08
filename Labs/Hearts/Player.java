package Labs.Hearts;

public class Player {
    private String name;
    private int score;

    public Player(final String n, final int s) {
        this.name = n;
        this.score = s;
    }

    // Accessors
    public String getName() { return this.name; }
    public int getScore() { return this.score; }

    // Modifiers
    public void setName(final String n) { this.name = n; }
    public void setScore(final int s) { this.score = s; }

    public void updateScore(final int u) { this.score += u; }

    @Override
    public String toString() { return String.format("%s %d", this.name, this.score); }
}
