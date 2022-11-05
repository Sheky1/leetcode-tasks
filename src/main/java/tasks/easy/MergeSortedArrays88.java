package tasks.easy;

import java.util.Arrays;

public class MergeSortedArrays88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter1 = m-1, counter2 = n-1;
        for(int i = m + n - 1; i >= 0; i--) {
            if(counter1 == -1) {
                nums1[i] = nums2[counter2];
                counter2--;
            }
            else if(counter2 == -1) {
                nums1[i] = nums1[counter1];
                counter1--;
            }
            else if(nums1[counter1] <= nums2[counter2]) {
                nums1[i] = nums2[counter2];
                counter2--;
            } else {
                nums1[i] = nums1[counter1];
                counter1--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
