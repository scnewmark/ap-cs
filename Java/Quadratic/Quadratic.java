package Quadratic;

public class Quadratic {
    private double a;
    private double b;
    private double c;
    private String root1;
    private String root2;

    public Quadratic(double n1, double n2, double n3) {
        a = n1;
        b = n2;
        c = n3;
    }

    public void solve() {
        double numerator;
        double denominator;
        double d;

        d = (b * b) - 4*(a)*(c);
        if (d < 0) {
            double part1 = -b / (2 * a);
            double part2 = Math.floor(Math.sqrt(-d / (2 * a))) - 1;
            root1 = part1 + " + " + part2 + "i";
            root2 = part1 + " + " + part2 + "i";
            QuadraticTest.imaginaryRoots++;
        } else if (d == 0) {
            numerator = -b + Math.sqrt(d);
            denominator = 2 * a;
            root1 = "" + (numerator / denominator);
            QuadraticTest.realRoots++;
        } else {
            numerator = -b + Math.sqrt(d);
            denominator = 2 * a;
            root1 = "" + (numerator / denominator);
    
            numerator = -b - Math.sqrt(d);
            root2 = "" + (numerator / denominator);
            QuadraticTest.realRoots++;
        }
    }

    public String toString() {
        String equation = a + "x^2 + " + b + "x + " + c;
        double d = (b * b) - 4*(a)*(c);
        if (root1 == null) {
            return equation + " has not been solved yet.";
        }
        return equation + ((root2 != null) ? " has two " + (d < 0 ? "imaginary" : "real") + " roots at " + root1 + " & " + root2 + "." : " has one " + (d < 0 ? "imaginary " : "") + "root at " + root1 + ".");
    }

}
