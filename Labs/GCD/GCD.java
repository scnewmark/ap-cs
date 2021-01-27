package Labs.GCD;

public class GCD {
    private int numerator;
    private int denominator;

    public GCD() {
        numerator = 0;
        denominator = 0;
    }

    public GCD(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int n) {
        denominator = n;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int calculateGCD() {
        int numCopy = numerator;
        int denCopy = denominator;
        while (numCopy != denCopy) {
        	if (numCopy > denCopy) {
                numCopy = numCopy - denCopy;
            } else {
                denCopy = denCopy - numCopy;
            }
        }
        return numCopy;
    }

    public int calculateLowestNum() {
        return numerator / calculateGCD();
    }

    public int calculateLowestDen() {
        return denominator / calculateGCD();
    }

    @Override
    public String toString() {
        return "The GCD is " + calculateGCD() 
            + "\nThe fraction in lowest terms is " + calculateLowestNum() + "/" + calculateLowestDen();
    }
}
