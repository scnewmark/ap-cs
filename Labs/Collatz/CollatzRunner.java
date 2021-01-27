package Labs.Collatz;

import java.util.Scanner;

public class CollatzRunner {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Starting Number ");
        int startNum = sc.nextInt();
        sc.nextLine();

        Collatz collatz = new Collatz(startNum);
        System.out.println(collatz);
        System.out.println("Number of steps " + collatz.steps() + 
        "\nMaximum value " + collatz.maxValue() + 
        "\nMinimum odd value " + collatz.minOddValue());

        int[] oddVals = collatz.oddValues();
        for (int i = 0; i < oddVals.length; i++) {
            System.out.print((i == 0 ? "Odd values [" : "") + oddVals[i] + (i == oddVals.length - 1 ? "]\n" : ", "));
        }
        System.out.println("Sum of all values " + collatz.sumValues());

        int[] sequence = collatz.sequence();
        for (int i = 1; i < sequence.length; i++) {
            System.out.println("step " + i + " " + sequence[i - 1]);
        }
    }
}
