import BalancedBinaryTree.BalancedBinaryTree;
import BalancedBinaryTree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BalancedBinaryTreeTest {
    @Test
    @DisplayName("V1.0")
    void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        root.right = treeNode1;
        treeNode1.left = new TreeNode(15);
        treeNode1.right = new TreeNode(7);
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        assertEquals(true, balancedBinaryTree.isBalanced(root));
    }

    @Test
    @DisplayName("V1.0")
    void test_1() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        root.left = treeNode1;
        root.right = new TreeNode(2);

        TreeNode treeNode2 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = new TreeNode(3);

        TreeNode treeNode3 = new TreeNode(4);
        treeNode2.left = treeNode3;
        treeNode2.right = new TreeNode(4);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        assertEquals(false, balancedBinaryTree.isBalanced(root));
    }


}
