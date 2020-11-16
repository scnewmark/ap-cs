package Collatz;

import java.util.Arrays;
import java.util.ArrayList;

public class Collatz {
    private final int startNum;

    public Collatz(int n) {
        startNum = n;
    }

    public int steps() {
        int steps = 1;
        int num = startNum;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            steps++;
        }
        return steps;
    }

    public int[] sequence() {
        int num = startNum;
        int[] arr = new int[steps() + 1];
        arr[0] = num;
        for (int i = 1; i < steps(); i++) {
            if (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
            }
            arr[i] = num;
        }
        return arr;
    }

    public int maxValue() {
        int[] sequence = sequence();
        Arrays.sort(sequence);
        return sequence[sequence.length - 1];
    }

    public int minOddValue() {
        int[] sequence = sequence();
        Arrays.sort(sequence);
        for (int i: sequence) {
            if (i % 2 != 0 && i != 1) {
                return i;
            }
        }
        return 0;
    }

    public int[] oddValues() {
        int[] sequence = sequence();
        ArrayList<Integer> oddValues = new ArrayList<Integer>();
        for (int i: sequence) {
            if (i % 2 != 0) {
                oddValues.add(i);
            }
        }
        return oddValues.stream().mapToInt(i -> i).toArray();
    }

    public int sumValues() {
        int[] sequence = sequence();
        int total = 0;
        for (int i: sequence) {
            total += i;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Starting Number " + startNum + " takes " + steps() + " steps";
    }
}
