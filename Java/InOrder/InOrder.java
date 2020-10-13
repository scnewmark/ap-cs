package InOrder;

public class InOrder {
    private int numOne;
    private int numTwo;
    private int numThree;

    public InOrder() {
        numOne = 0;
        numTwo = 0;
        numThree = 0;
    }

    public InOrder(int n1, int n2, int n3) {
        numOne = n1;
        numTwo = n2;
        numThree = n3;
    }

    public void setNumOne(int n1) {
        numOne = n1;
    }

    public void setNumTwo(int n2) {
        numTwo = n2;
    }

    public void setNumThree(int n3) {
        numThree = n3;
    }

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public int getNumThree() {
        return numThree;
    }

    public boolean isInOrder() {
        if ((numOne <= numTwo) && (numTwo <= numThree)) {
            return true;
        } else {
            return false;
        }
    }

    public void orderValues() {
        int temp;
        if (numThree < numOne) {
            temp = numOne;
            setNumOne(numThree);
            setNumThree(temp);
        }
        if (numThree < numTwo) {
            temp = numTwo;
            setNumTwo(numThree);
            setNumThree(temp);
        }
        if (numOne > numTwo) {
            temp = numOne;
            setNumOne(numTwo);
            setNumTwo(temp);
        }
    }

    public String toString() {
        return "" + numOne + " " + numTwo + " " + numThree;
    }
}
