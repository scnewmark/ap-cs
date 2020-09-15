/* Instructions:

Write a program that asks What is your name? and then prints
Hello name!
asks How old are you? and then prints
Your age in months is ageInMonths.
asks for your favorite two bands - each band name could be more then one word.  
asks What is your favorite band? and What is your 2nd favorite band? and then prints
I like band A and band B too!!! */

package Java;

import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Gets the users name and says hello.
        System.out.println("What is your name?");
        String name = sc.nextLine(); 
        System.out.println("Hello " + name + "!");

        // Gets the users age and then says the age in months.
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Your age in months is " + (age * 12) + ".");

        // Gets the users two favorite bands.
        System.out.println("What is your favorite band?");
        String favBandOne = sc.nextLine();
        System.out.println("What is your 2nd favorite band?");
        String favBandTwo = sc.nextLine();
        System.out.println("I like " + favBandOne + " and " + favBandTwo + " too!");

        sc.close();
    }
}
