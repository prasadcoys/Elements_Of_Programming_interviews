package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class CousinsInBInaryTreeTest {

    @Test
    public void testIfTwoNodesAtSameLevelButBelongingToSameParentAreClassifiedAsNotCousins(){
        TreeNode rootNode = createTree();
        Assert.assertFalse(new CousinsInBinaryTree().isCousins(rootNode,2,
                3));

    }

    @Test
    public void testIfTwoNodesAtDifferentLevelButBelongingToDifferentParentAreClassifiedAsNotCousins(){
        TreeNode rootNode = createTree();
        Assert.assertFalse(new CousinsInBinaryTree().isCousins(rootNode,3,
                4));

    }

    @Test
    public void testIfTwoNodesAtSameLevelAndHaveDifferentParentsAreClassifiedAsCousins(){
        TreeNode rootNode = createTree();
        Assert.assertTrue(new CousinsInBinaryTree().isCousins(rootNode,4
                ,5));

    }

    public TreeNode createTree() {
        TreeNode twoNode = new TreeNode(2);
        TreeNode threeNode = new TreeNode(3);
        TreeNode oneNode = new TreeNode(1);
        TreeNode fourNode = new TreeNode(4);
        TreeNode fiveNode = new TreeNode(5);
        oneNode.left = twoNode;
        twoNode.left = fourNode;
        oneNode.right = threeNode;
        threeNode.right = fiveNode;
        return oneNode;
    }

}
