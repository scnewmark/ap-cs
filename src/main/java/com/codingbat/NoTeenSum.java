package com.codingbat;

public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19) {
          return  n == 15 || n == 16 ? n : 0;
        }
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
    }
}
