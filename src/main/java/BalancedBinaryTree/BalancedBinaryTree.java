package BalancedBinaryTree;

public class BalancedBinaryTree {

    private boolean judge = true;

    public boolean isBalanced(TreeNode root) {
        getDepth(root);
        return judge;
    }


    private int getDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            int left = getDepth(root.left);
            int right = getDepth(root.right);

            if (Math.abs(left - right) > 1) {
                judge = false;
            }
            return left > right ? ++left : ++right;
        }
    }
}