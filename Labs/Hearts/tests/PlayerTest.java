package Labs.Hearts.tests;

import Labs.Hearts.*;

public class PlayerTest {
    public static void main(String[] args) {
        final Player p1 = new Player("Kara Jones", 0);
        System.out.printf("\n\nCreated Player -> %s\n", p1.toString());
        p1.updateScore(6);
        System.out.printf("After scoring 6 points -? %s\n", p1.toString());

        final Player p2 = new Player("Bob Smith", 27);
        System.out.printf("Created Player -> %s\n", p2.toString());
        p2.updateScore(65);
        System.out.printf("After scoring 65 points -? %s\n", p2.toString());
    }
}
