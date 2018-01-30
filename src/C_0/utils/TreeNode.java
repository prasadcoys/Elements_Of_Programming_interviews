package C_0.utils;

public class TreeNode
{
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int value)
    {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public void setLeftNode(TreeNode leftNode)
    {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode)
    {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode()
    {
        return leftNode;
    }

    public TreeNode getRightNode()
    {
        return rightNode;
    }

    @Override
    public String toString()
    {
        return ""+this.value;
    }

    public int getValue()
    {
        return value;
    }

    public boolean hasLeftNode()
    {
        return leftNode!=null;
    }

    public boolean hasRightNode()
    {
        return rightNode!=null;
    }
}
