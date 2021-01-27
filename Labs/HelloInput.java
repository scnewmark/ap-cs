package Labs;

import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Gets the users name and says hello.
        System.out.println("What is your name?");
        String name = sc.next(); 
        System.out.println("Hello " + name + "!");

        // Gets the users age and then says the age in months.
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Your age in months is " + (age * 12) + ".");
        sc.nextLine();

        // Gets the users two favorite bands.
        System.out.println("What is your favorite band?");
        String favBandOne = sc.nextLine();
        System.out.println("What is your 2nd favorite band?");
        String favBandTwo = sc.nextLine();
        System.out.println("I like " + favBandOne + " and " + favBandTwo + " too!");

        sc.close();
    }
}
