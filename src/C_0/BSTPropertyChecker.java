package C_0;

import C_0.utils.BinaryTree;
import C_0.utils.TreeNode;

public class BSTPropertyChecker
{
    public static boolean isBSTPropertySatisfied(BinaryTree tree)
    {
        return isNodeBSTCompliant(tree.getRootNode());
    }

    private static boolean isNodeBSTCompliant(TreeNode middleNode)
    {
        boolean isCompliant = true;
        if (middleNode.hasLeftNode())
        {
            if (middleNode.getValue() > middleNode.getLeftNode().getValue())
            {
                if (!isNodeBSTCompliant(middleNode.getLeftNode()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        if (middleNode.hasRightNode())
        {
            if (middleNode.getValue() < middleNode.getRightNode()
                                                  .getValue())
            {
                if (!isNodeBSTCompliant(middleNode.getRightNode()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        if (!middleNode.hasRightNode() && !middleNode.hasLeftNode())
        {
            return true;
        }
        return true;
    }
}
