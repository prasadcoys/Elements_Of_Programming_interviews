package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class BSTFromPreorderTest {
    @Test
    public void testIfBinarySearchTreeCanBeConstructedFromOneElement() {
        int[] preOrder = new int[]{1};
        TreeNode expectedNode = new TreeNode(1, null, null);
        String expectedPreorder = getPreOrder(expectedNode,
                new StringBuilder("")).toString();
        Assert.assertEquals("1",expectedPreorder);
        Assert.assertEquals(expectedPreorder,
                getPreOrder(new BSTFromPreorder().bstFromPreorder(preOrder),new StringBuilder("")).toString());
    }

    @Test
    public void testIfBSTCanBeConstructedFromTwoLevels(){
        int[] preorder = new int[]{2,1,3};
        Assert.assertEquals("213",
                getPreOrder(new BSTFromPreorder().bstFromPreorder(preorder),new StringBuilder("")).toString());
    }

    @Test
    public void testIfBSTCanBeConstructedFromMultipleLevels(){
        int[] preorder = new int[]{8,5,1,7,10,12};
        Assert.assertEquals("85171012",
                getPreOrder(new BSTFromPreorder().bstFromPreorder(preorder),new StringBuilder("")).toString());
    }

    private StringBuilder getPreOrder(TreeNode expectedNode, StringBuilder s) {
        if (expectedNode == null) {
            return s;
        }
        s.append(expectedNode.val);
        getPreOrder(expectedNode.left, s);
        getPreOrder(expectedNode.right, s);
        return s;
    }
}
