package GCD;

import java.util.Scanner;

public class GCDRunner {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the numerator: ");
        int numerator = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the denominator: ");
        int denominator = sc.nextInt();
        sc.nextLine();

        GCD gcd = new GCD(numerator, denominator);

        System.out.println(gcd);
    }
}
