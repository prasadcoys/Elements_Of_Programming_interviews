package C_0;

import C_0.utils.BinaryTree;
import C_0.utils.TreeNode;
import C_0.utils.TreeUnbalancedException;

public class TreeBalanceChecker
{
    public static boolean isBalancedBinaryTree(BinaryTree tree)
    {
        boolean isTreeBalanced = false;

        TreeNode rootNode = tree.getRootNode();
        int leftHeight = 0;
        int rightHeight = 0;
        try
        {
            leftHeight = getHeight(rootNode.getLeftNode());
            rightHeight = getHeight(rootNode.getRightNode());
        } catch (TreeUnbalancedException e)
        {
            return false;
        }

        if(Math.abs(rightHeight - leftHeight)<=1)
        {
            isTreeBalanced = true;
        }
        return isTreeBalanced;
    }

    private static int getHeight(TreeNode treeNode) throws TreeUnbalancedException
    {
        if(treeNode == null)
        {
            return -1;
        }
        if(treeNode.getLeftNode() == null && treeNode.getRightNode() ==
                null)
        {
            return 0;
        }

        int leftHeight = getHeight(treeNode.getLeftNode());
        int rightHeight = getHeight(treeNode.getRightNode());
        if((Math.abs(rightHeight - leftHeight) >1))
        {
            throw new TreeUnbalancedException();
        }
        return (Math.max(leftHeight,rightHeight)) +1;
    }
}
