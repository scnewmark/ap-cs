package Calculator;

import java.util.Scanner;

public class CalculatorRunner {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;

        System.out.println("Enter the operator:");
        operator = sc.next().charAt(0);
        boolean validOperator = (operator == '+') || (operator == '-') || (operator == '*') || (operator == '/');
        if (!validOperator) {
            System.out.println("Invalid Operator");
            return;
        }

        System.out.println("Enter the first operand:");
        try {
            num1 = sc.nextInt();
        } catch (Exception e) {
            num1 = sc.nextDouble();
        }
        sc.nextLine();

        System.out.println("Enter the second operand:");
        try {
            num2 = sc.nextInt();
        } catch (Exception e) {
            num2 = sc.nextDouble();
        }
        sc.nextLine();

        boolean divBy0 = (operator == '/') && (num2 == 0);
        if (divBy0) {
            System.out.println("Cannot Divide by Zero");
            return;
        }

        Calculator calculator = new Calculator(num1, num2, operator);
        System.out.println("result = " + calculator.result());
        System.out.println(calculator.toString());
    }
}
