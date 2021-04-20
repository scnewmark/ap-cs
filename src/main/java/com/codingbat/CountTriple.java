package com.codingbat;

public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("xxxabyyyycd")); // 3
    }

    public static int countTriple(final String str) {
        final char[] ch = str.toCharArray();
        if (ch.length < 3) return 0;
        final int count = count(ch, 0, 3, 0);
        return count;
    }

    public static int count(final char[] arr, int start, int end, int count) {
        final int threshold = arr.length + 1;
        if (end != threshold) {
            final char[] ch = slice(arr, start, end);
            if (ch[0] == ch[1] && ch[1] == ch[2]) {
                count++;
            }
            return count(arr, start+1, end+1, count);
        }
        return count;
    }

    public static char[] slice(final char[] arr, final int start, final int end) {
        final char[] c = new char[end-start];
        int index = 0;
        for (int i = start; i < end; i++) {
            c[index] = arr[i];
            index++;
        }
        return c;
    }
}
