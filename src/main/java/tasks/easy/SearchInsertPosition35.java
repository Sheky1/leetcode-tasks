package tasks.easy;

public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) return i;
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
