package tasks.easy;

import java.util.Arrays;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
