package com.codingbat.recursion;

public class StrCopies {
    public static boolean strCopies(String str, String sub, int n) {
        if (count(str, sub, 0, sub.length(), 0) >= n) {
            return true;
        }
        return false;
    }

    public static int count(final String str, final String sub, int start, int end, int count) {
        if (end == str.length() + 1) return count;
        if (str.substring(start, end).equals(sub)) count++;
        return count(str, sub, start + 1, end + 1, count);
    }
}
