package Deal;

import java.util.Scanner;

public class DealRunner {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many simulations would you like to run? ");
        int iterations = sc.nextInt();
        sc.nextLine();

        int prizeLocation;
        int userGuess;
        int winsBySwitching = 0;
        int revealedDoor;
        int newGuess;

        for (int i = 0; i < iterations; i++) {
            Deal deal = new Deal();
            userGuess = deal.getUserGuess();
            prizeLocation = deal.getPrizeLoc();

            revealedDoor = deal.randomNum();
            while ((revealedDoor == userGuess) || (revealedDoor == prizeLocation)) {
                revealedDoor = deal.randomNum();
            }

            newGuess = deal.randomNum();
            while ((newGuess == revealedDoor) || (newGuess == userGuess)) {
                newGuess = deal.randomNum();
            }

            boolean win = false;
            if (newGuess == prizeLocation) {
                winsBySwitching++;
                win = true;
            }

            System.out.println("prize: " + prizeLocation + " guess: " + userGuess + " view: " + revealedDoor + " new guess: " + newGuess + " win: " + win);
        }
        double probabilty = (double) winsBySwitching / iterations;
        System.out.println("Probability of winning if you switch: " + probabilty);
        System.out.println("Probability of winning if you do not switch: " + (1 - probabilty));
    }
}
