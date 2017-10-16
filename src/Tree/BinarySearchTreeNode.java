package Tree;

public class BinarySearchTreeNode<Type extends Number> {


    BinarySearchTreeNode leftNode;
    BinarySearchTreeNode rightNode;
    Type value;

    public BinarySearchTreeNode(Type value) {
        this.value = value;
    }

    public boolean hasLeftNode() {
        return leftNode != null;
    }

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public Type getValue() {
        return value;
    }

    public boolean hasRightNode() {
        return rightNode != null;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
