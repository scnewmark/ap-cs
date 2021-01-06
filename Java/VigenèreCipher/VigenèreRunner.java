package VigenèreCipher;

import java.util.Scanner;

public class VigenèreRunner {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your message: ");
        final String input = sc.nextLine();
        
        System.out.print("Enter you keyword: ");
        final String key = sc.nextLine();

        Vigenère cipher = new Vigenère(input, key);
        cipher.encrypt();
        System.out.println(cipher);
    }
}
