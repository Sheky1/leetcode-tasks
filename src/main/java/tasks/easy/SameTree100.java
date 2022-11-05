package tasks.easy;

public class SameTree100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return checkNodes(p, q);
    }

    public static  boolean checkNodes(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        boolean leftSide = checkNodes(p.left, q.left);
        boolean rightSide = checkNodes(p.right, q.right);
        return leftSide && rightSide && p.val == q.val;
    }

    public static void main(String[] args) {

    }

}
