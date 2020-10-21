package Calculator;

import java.util.Scanner;

public class CalculatorRunner {
    final static Scanner sc = new Scanner(System.in);

    static double setOperand(String n) {
        double num;
        System.out.println("Enter the " + n + " operand:");
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            num = sc.nextDouble();
        }
        sc.nextLine();
        return num;
    }

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

       num1 = setOperand("first");
       num2 = setOperand("second");

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