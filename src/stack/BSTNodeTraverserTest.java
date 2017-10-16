package stack;

import Tree.BinarySearchTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BSTNodeTraverserTest {

    @Test
    public void doNothing() {

    }

    @Test
    public void testIfBSTWithNoSubTreesAreReadInSortedOrder() {
        BinarySearchTreeNode bst = new BinarySearchTreeNode(3);
        BinarySearchTreeNode rightNode = new BinarySearchTreeNode(5);
        BinarySearchTreeNode leftNode = new BinarySearchTreeNode(1);
        bst.setRightNode(rightNode);
        bst.setLeftNode(leftNode);
        assertEquals("1 3 5", BSTNodeTraverser.getSortedList(bst));

    }

    @Test
    public void testIfBSTWithSubTreesIsReadInSortedOrder() {
        BinarySearchTreeNode bstRootNode = new BinarySearchTreeNode(43);
        BinarySearchTreeNode bstNode1 = new BinarySearchTreeNode(23);
        BinarySearchTreeNode bstNode2 = new BinarySearchTreeNode(47);
        bstRootNode.setLeftNode(bstNode1);
        bstRootNode.setRightNode(bstNode2);
        BinarySearchTreeNode bstNode3 = new BinarySearchTreeNode(37);
        BinarySearchTreeNode bstNode4 = new BinarySearchTreeNode(53);
        BinarySearchTreeNode bstNode5 = new BinarySearchTreeNode(29);
        BinarySearchTreeNode bstNode6 = new BinarySearchTreeNode(41);
        BinarySearchTreeNode bstNode7 = new BinarySearchTreeNode(31);
        bstNode5.setRightNode(bstNode7);
        bstNode3.setLeftNode(bstNode5);
        bstNode3.setRightNode(bstNode6);
        bstNode2.setRightNode(bstNode4);
        bstNode1.setRightNode(bstNode3);
        assertEquals("23 29 31 37 41 43 47 53", BSTNodeTraverser.getSortedList(bstRootNode));

    }

    @Test
    public void testIfANodeHasOnlyRightNodesIsSortedCorrectly() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(4);
        BinarySearchTreeNode rightOneNode = new BinarySearchTreeNode(5);
        BinarySearchTreeNode rightTwoNode = new BinarySearchTreeNode(6);
        rootNode.setRightNode(rightOneNode);
        rightOneNode.setRightNode(rightTwoNode);
        assertEquals("4 5 6", BSTNodeTraverser.getSortedList(rootNode));
    }

    @Test
    public void testIfANodeHasOnlyLeftNodeIsSortedCorrectly() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(6);
        BinarySearchTreeNode leftOneNode = new BinarySearchTreeNode(5);
        BinarySearchTreeNode leftTwoNode = new BinarySearchTreeNode(4);
        BinarySearchTreeNode leftThreeNode = new BinarySearchTreeNode(3);
        rootNode.setLeftNode(leftOneNode);
        leftOneNode.setLeftNode(leftTwoNode);
        leftTwoNode.setLeftNode(leftThreeNode);
        assertEquals("3 4 5 6", BSTNodeTraverser.getSortedList(rootNode));
    }
}
