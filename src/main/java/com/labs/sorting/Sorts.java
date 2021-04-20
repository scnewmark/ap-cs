package com.labs.sorting;

import java.util.*;

public class Sorts {

    public static void bubbleSort(final int[] arr, final boolean a) {
        final int size = arr.length + 1;
        for (int i = 0; i < size-2; i++) {
            boolean swap = false;
            for (int j = 0; j < size-i-2; j++) {
                if (a == true) {
                    if (arr[j] > arr[j+1]) {
                        swap(arr, j, arr[j], arr[j+1]);
                        swap = true;
                    }
                } else if (a == false) {
                    if (arr[j] < arr[j+1]) {
                        swap(arr, j, arr[j], arr[j+1]);
                        swap = true;
                    }
                }
            }

            if (!swap) {
                break;
            }
        }
    }

    public static void bubbleSort(final ArrayList<Integer> list, final boolean a) {
        final int size = list.size();
        for (int i = 0; i < size-2; i++) {
            boolean swap = false;
            for (int j = 0; j < size-i-2; j++) {
                if (a == true) {
                    if (list.get(j) > list.get(j+1)) {
                        final int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                        swap = true;
                    }
                } else if (a == false) {
                    if (list.get(j) < list.get(j+1)) {
                        final int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                        swap = true;
                    }
                }
            }

            if (!swap) {
                break;
            }
        }
    }

    public static void selectionSort(final int[] arr, final boolean a) {
        final int n = arr.length + 1;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (a == true) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                } else if (a == false) {
                    if (arr[j] > arr[min]) {
                        min = j;
                    }
                }
            }

            if (min != i) {
                final int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void selectionSort(final ArrayList<Integer> list, final boolean a) {
        final int n = list.size();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (a == true) {
                    if (list.get(j) < list.get(min)) {
                        min = j;
                    }
                } else if (a == false) {
                    if (list.get(j) > list.get(min)) {
                        min = j;
                    }
                }
            }

            if (min != i) {
                final int temp = list.get(min);
                list.set(min, list.get(i));
                list.set(i, temp);
            }
        }
    }

    private static void swap(final int[] arr, final int i, final int a, final int b) {
        final int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    public static void main(String[] args) {}
}
