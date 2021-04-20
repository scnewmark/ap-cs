package com.codingbat;

public class OverTop42 {
    public static int overTop42(int a, int b) {
        if (a > 42 && b > 42) {
            return 0;
        } else if (a > 42) {
            return b;
        } else if (b > 42) {
            return a;
        }

        final int distanceA = 42 - a;
        final int distanceB = 42 - b;
        return distanceB > distanceA ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(overTop42(29, 21));
        System.out.println(overTop42(47, 62));
        System.out.println(overTop42(55, 46));
    }

}
