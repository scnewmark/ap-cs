package Java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Declare variables to store user input
        String strOne;
        String strTwo;
        String operation = "";
        int answer = 0;

        // Declare a scanner
        Scanner in = new Scanner(System.in);

        // Select first number
        System.out.println("First Number: ");
        strOne = in.nextLine();
        System.out.println("You've selected " + strOne + " as your first number.");

        System.out.println("Second Number: ");
        strTwo = in.nextLine();
        System.out.println("You've selected " + strTwo + " as your second number.");

        System.out.println("Choose an operation: ");
        operation = in.nextLine();
        System.out.println("You've selected " + operation + " as your operation.");

        in.close();

        int numOne = Integer.parseInt(strOne.trim());
        int numTwo = Integer.parseInt(strTwo.trim());

        // Perform calculations
        switch(operation) {
            case "+":
                answer = numOne + numTwo;
                break;
            case "-":
                answer = numOne - numTwo;
                break;
            case "*":
                answer = numOne * numTwo;
                break;
            case "/":
                answer = numOne / numTwo;
                break;
            default:
                System.out.println("This is not a valid operation!");
                break;
        }

        // Prints the result of the equation to console
        System.out.println("The answer to the equation (" + strOne + operation + strTwo + ") is " + answer + ".");
    }
}