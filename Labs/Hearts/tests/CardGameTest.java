package Labs.Hearts.tests;

import Labs.Hearts.*;

public class CardGameTest {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        CardGame game = new CardGame("Hearts", 4, new String[] {"Player0", "Player1", "Player2", "Player3"}, 0);
        System.out.println(game);
        System.out.println();

        int badPoints = 0;
        for (int i = 0; i < 20000; i++) {
            System.out.println("Playing game #" + (i + 1) + ": ");
            game.playGame();
            for (final CardPlayer cp : game.getPlayers()) {
                System.out.println("Adding " + cp.getScore() + " points");
                badPoints += cp.getScore();
            }
            game = new CardGame("Hearts", 4, new String[] {"Player0", "Player1", "Player2", "Player3"}, 0);
            System.out.println("---------------------------------------------");
        }
        System.out.println("Total number of bad points = " + badPoints);
    }
}
