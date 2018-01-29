package C_0;

import C_0.utils.BinaryTree;
import C_0.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BSTPropertyCheckerTest
{
    @Test
    public void testIfValidBSTTreeIsPassedByBSTChecker()
    {
        TreeNode middleNode = new TreeNode(2);
        TreeNode leftNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(3);
        middleNode.setLeftNode(leftNode);
        middleNode.setRightNode(rightNode);
        BinaryTree tree = new BinaryTree(middleNode);
        assertTrue(BSTPropertyChecker.isBSTPropertySatisfied(tree));

    }
    @Test
    public void testIfInvalidBinaryTreeIsFailedByBSTChecker()
    {
        TreeNode middleNode = new TreeNode(1);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(3);
        middleNode.setLeftNode(leftNode);
        middleNode.setRightNode(rightNode);
        BinaryTree tree = new BinaryTree(middleNode);
        assertFalse(BSTPropertyChecker.isBSTPropertySatisfied(tree));
    }

}
