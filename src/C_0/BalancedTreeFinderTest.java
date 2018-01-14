package C_0;

import C_0.utils.BinaryTree;
import C_0.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BalancedTreeFinderTest
{

    @Test
    public void testIfBalancedTreeOfHeightOneReturnsTrue()
    {
        TreeNode node = new TreeNode(2);
        TreeNode leftNode = new TreeNode(3);
        TreeNode rightNode = new TreeNode(4);
        node.setLeftNode(leftNode);
        node.setRightNode(rightNode);
        BinaryTree tree = new BinaryTree(node);
        assertTrue(TreeBalanceChecker.isBalancedBinaryTree(tree));
    }

}
