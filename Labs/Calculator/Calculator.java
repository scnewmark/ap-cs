package Labs.Calculator;

public class Calculator {
    private double num1;
    private double num2;
    private char operand;

    public Calculator() {
        num1 = 0;
        num2 = 0;
        operand = 0;
    }

    public Calculator(double n1, double n2, char op) {
        num1 = n1;
        num2 = n2;
        operand = op;
    }

    public void setNum1(double n1) {
        num1 = n1;
    }

    public void setNum2(double n2) {
        num2 = n2;
    }

    public void setOperand(char op) {
        operand = op;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getOperand() {
        return operand;
    }

    public double result() {
        if (operand == '+') {
            return num1 + num2;
        } else if (operand == '-') {
            return num1 - num2;
        } else if (operand == '/') {
            return num1 / num2;
        } else if (operand == '*') {
            return num1 * num2;
        } else {
            return 404;
        }

    }

    public String toString() {
        return "" + num1 + " " + operand + " " + num2 + " = " + result();
    }
}
