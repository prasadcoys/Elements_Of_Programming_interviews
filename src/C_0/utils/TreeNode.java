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
}
