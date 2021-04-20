package com.codingbat;

import java.util.Arrays;

public class PostFour {
    public static int[] postFour(final int[] nums) {
        int lastFour = 0, size = 0;
        for (int i = 0; i < nums.length; i++) if (nums[i] == 4) lastFour = i;
        for (int i = 0; i < nums.length; i++) if (i > lastFour) size++;

        final int[] res = new int[size];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > lastFour) {
                res[index] = nums[i];
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(postFour(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(postFour(new int[]{4, 1, 4, 2})));
        System.out.println(Arrays.toString(postFour(new int[]{4, 4, 1, 2, 3})));
    }
}
