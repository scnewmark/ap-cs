package CodingBat;

import java.util.Arrays;

public class RotateLeftThree {
    public static int[] rotate(int[] nums) {
        final int[] res = new int[3];
        int index = 0;
        for (int i = 1; i < 4; i++) {
            if (i == 3) {
                i = 0;
                res[index] = nums[i];
                break;
            }
            res[index] = nums[i];
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotate(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotate(new int[]{7, 0, 0})));
    }
}
