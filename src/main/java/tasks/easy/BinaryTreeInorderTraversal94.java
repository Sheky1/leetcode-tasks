package tasks.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveTraversal(root, result);
        return result;
    }

    private void recursiveTraversal(TreeNode root, List<Integer> result) {
        if(root == null) return;
        recursiveTraversal(root.left, result);
        result.add(root.val);
        recursiveTraversal(root.right, result);
    }

    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}