package tasks.easy;

public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return checkNodes(root.left, root.right);
    }

    public boolean checkNodes(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return checkNodes(left.left, right.right) && checkNodes(left.right, right.left);
    }

    public static void main(String[] args) {

    }
}
