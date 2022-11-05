package tasks.easy;

public class ConvertSortedArrayToBinarySearchTree108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createNode(nums, 0, nums.length - 1);
    }

    public TreeNode createNode(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createNode(nums, left, mid - 1);
        root.right = createNode(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {

    }
}
