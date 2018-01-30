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

    @Test
    public void testIfValidBinaryTreeWithFiveLevelsIsPassedByBSTChecker()
    {
        TreeNode rootNode = new TreeNode(19);
        TreeNode l10Node = new TreeNode(7);
        TreeNode l11Node = new TreeNode(43);
        TreeNode l20Node = new TreeNode(3);
        TreeNode l21Node = new TreeNode(11);
        TreeNode l22Node = new TreeNode(23);
        TreeNode l23Node = new TreeNode(47);
        TreeNode l30Node = new TreeNode(2);
        TreeNode l31Node = new TreeNode(5);
        TreeNode l32Node = new TreeNode(17);
        TreeNode l33Node = new TreeNode(37);
        TreeNode l34Node = new TreeNode(53);
        TreeNode l40Node = new TreeNode(13);
        TreeNode l41Node = new TreeNode(29);
        TreeNode l42Node = new TreeNode(41);
        TreeNode l50Node = new TreeNode(31);
        rootNode.setLeftNode(l10Node);
        rootNode.setRightNode(l11Node);
        l10Node.setLeftNode(l20Node);
        l10Node.setRightNode(l21Node);
        l11Node.setLeftNode(l22Node);
        l11Node.setRightNode(l23Node);
        l20Node.setLeftNode(l30Node);
        l20Node.setRightNode(l31Node);
        l21Node.setRightNode(l32Node);
        l32Node.setLeftNode(l40Node);
        l22Node.setRightNode(l33Node);
        l23Node.setRightNode(l34Node);
        l33Node.setLeftNode(l41Node);
        l33Node.setRightNode(l42Node);
        l41Node.setRightNode(l50Node);
        assertTrue(BSTPropertyChecker.isBSTPropertySatisfied(new BinaryTree
                (rootNode)));
    }


    @Test
    public void testIfInValidBinaryTreeWithFiveLevelsIsFailedByBSTChecker()
    {
        TreeNode rootNode = new TreeNode(19);
        TreeNode l10Node = new TreeNode(7);
        TreeNode l11Node = new TreeNode(43);
        TreeNode l20Node = new TreeNode(3);
        TreeNode l21Node = new TreeNode(11);
        TreeNode l22Node = new TreeNode(23);
        TreeNode l23Node = new TreeNode(47);
        TreeNode l30Node = new TreeNode(2);
        TreeNode l31Node = new TreeNode(5);
        TreeNode l32Node = new TreeNode(17);
        TreeNode l33Node = new TreeNode(37);
        TreeNode l34Node = new TreeNode(53);
        TreeNode l40Node = new TreeNode(13);
        TreeNode l41Node = new TreeNode(29);
        TreeNode l42Node = new TreeNode(41);
        TreeNode l50Node = new TreeNode(31);
        rootNode.setLeftNode(l10Node);
        rootNode.setRightNode(l11Node);
        l10Node.setLeftNode(l20Node);
        l10Node.setRightNode(l21Node);
        l11Node.setLeftNode(l22Node);
        l11Node.setRightNode(l34Node);
        l20Node.setLeftNode(l30Node);
        l20Node.setRightNode(l31Node);
        l21Node.setRightNode(l32Node);
        l32Node.setLeftNode(l40Node);
        l22Node.setRightNode(l33Node);
        l34Node.setRightNode(l23Node);
        l33Node.setLeftNode(l41Node);
        l33Node.setRightNode(l42Node);
        l41Node.setRightNode(l50Node);
        assertFalse(BSTPropertyChecker.isBSTPropertySatisfied(new
                BinaryTree
                (rootNode)));
    }

}
