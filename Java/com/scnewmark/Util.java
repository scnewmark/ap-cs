package com.scnewmark;

public class Util<T> {
    private T[] arr;

    public Util() {}

    public Util(T[] arr) { this.arr = arr; }

    public void setArray(T[] arr) { this.arr = arr; }

    public void printArray() {
        if (this.arr == null) { System.out.print("[]"); }
        else
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i == 0 ? "[" : "") + arr[i] + (i == arr.length - 1 ? "]\n" : ", "));
            }
    }
}
