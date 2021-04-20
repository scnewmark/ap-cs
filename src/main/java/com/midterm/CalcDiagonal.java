package com.midterm;

public class CalcDiagonal {
    public static int calcDiagonal(int[] arr, int width) {
        int[][] twoD = convert2D(arr, width);
        int sum = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int k = 0; k < twoD[i].length; k++) {
                if (i == k) sum += twoD[i][k];
            }
        }
        return sum;
    }

    public static int[][] convert2D(int[] arr, int width) {
        int[][] twoD = new int[width][width];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < 1; k++) {
                if (col == width) {
                    col = 0;
                    row++;
                }
                twoD[row][col] = arr[i];
                col++;
            }
           
        }
        return twoD;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print(calcDiagonal(arr, 3));
    }
}
