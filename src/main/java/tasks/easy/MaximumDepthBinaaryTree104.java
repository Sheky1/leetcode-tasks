package tasks.easy;

public class MaximumDepthBinaaryTree104 {

    public int maxDepth(TreeNode root) {
        return checkNode(root, 0);
    }

    public int checkNode(TreeNode root, int result) {
        if(root == null) return result;
        result++;
        return Math.max(checkNode(root.left, result), checkNode(root.right, result));
    }

    public static void main(String[] args) {

    }
}
