package C_0;

import C_0.utils.BinaryTree;
import C_0.utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

    @Test
    public void testIfUnbalancedTreeOfHeightTwoReturnsFalse()
    {
        TreeNode rootNode = new TreeNode(2);
        TreeNode leftNodeOne = new TreeNode(3);
        TreeNode leftNodeTwo = new TreeNode(4);
        rootNode.setLeftNode(leftNodeOne);
        leftNodeOne.setLeftNode(leftNodeTwo);
        BinaryTree tree = new BinaryTree(rootNode);
        assertFalse(TreeBalanceChecker.isBalancedBinaryTree(tree));
    }
    @Test
    public void testTheExampleInBookReturnsFalse()
    {
        TreeNode nodeA = new TreeNode(314);
        TreeNode nodeB = new TreeNode(6);
        TreeNode nodeC = new TreeNode(271);
        TreeNode nodeD = new TreeNode(28);
        TreeNode nodeE = new TreeNode(0);
        TreeNode nodeF = new TreeNode(561);
        TreeNode nodeG = new TreeNode(3);
        TreeNode nodeH = new TreeNode(17);
        TreeNode nodeI = new TreeNode(6);
        TreeNode nodeJ = new TreeNode(2);
        TreeNode nodeK = new TreeNode(1);
        TreeNode nodeL = new TreeNode(401);
        TreeNode nodeM = new TreeNode(641);
        TreeNode nodeN = new TreeNode(257);
        TreeNode nodeO = new TreeNode(271);
        TreeNode nodeP = new TreeNode(28);
        TreeNode nodeX = new TreeNode(4);
        BinaryTree tree = new BinaryTree(nodeA);
        nodeA.setLeftNode(nodeB);
        nodeA.setRightNode(nodeI);
        nodeB.setLeftNode(nodeC);
        nodeB.setRightNode(nodeF);
        nodeC.setLeftNode(nodeD);
        nodeC.setRightNode(nodeE);
        nodeF.setRightNode(nodeG);
        nodeF.setLeftNode(nodeX);
        nodeG.setLeftNode(nodeH);
        nodeI.setLeftNode(nodeJ);
        nodeJ.setRightNode(nodeK);
        nodeK.setLeftNode(nodeL);
        nodeL.setRightNode(nodeM);
        nodeK.setRightNode(nodeN);
        nodeI.setRightNode(nodeO);
        nodeO.setRightNode(nodeP);
        assertFalse(TreeBalanceChecker.isBalancedBinaryTree(tree));
        assertTrue(TreeBalanceChecker.isBalancedBinaryTree(new
                BinaryTree(nodeB)));
    }

}
