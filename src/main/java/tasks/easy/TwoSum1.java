package tasks.easy;

import java.util.*;

public class TwoSum1 {

    public static int[] twoSumBrute(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, List<Integer>> valueMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!valueMap.containsKey(nums[i])) {
                valueMap.put(nums[i], new ArrayList<>());
                valueMap.get(nums[i]).add(i);
            } else {
                valueMap.get(nums[i]).add(i);
            }
        }
        for(Map.Entry<Integer, List<Integer>> entry: valueMap.entrySet()) {
            int difference = target - entry.getKey();
            if(difference == entry.getKey() && entry.getValue().size() > 1) {
                result[0] = entry.getValue().get(0);
                result[1] = entry.getValue().get(1);
                return result;
            }
            if(valueMap.containsKey(difference)) {
                result[0] = entry.getValue().get(0);
                result[1] = valueMap.get(difference).get(0);
                return result;
            }
        }
        return result;
    }

    public static int[] twoSumHashMapOnePass(int[] nums, int target) {
        Map<Integer, Integer> valueMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(valueMap.containsKey(difference)) {
                return new int[] {valueMap.get(difference), i};
            }
            valueMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSumBrute(numbers, 9)));
        System.out.println(Arrays.toString(twoSumHashMap(numbers, 9)));
        System.out.println(Arrays.toString(twoSumHashMapOnePass(numbers, 9)));
    }
}
