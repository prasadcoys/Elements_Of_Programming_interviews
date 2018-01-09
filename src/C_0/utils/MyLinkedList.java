package C_0.utils;

public class MyLinkedList
{
    LinkedListNode head = null;

    public void add(LinkedListNode nodeA)
    {
        if (head == null)
        {
            head = nodeA;
        } else
        {
            LinkedListNode lastNode = getLastNode();
            lastNode.setNextNode(nodeA);
        }
    }

    public LinkedListNode getLastNode()
    {
        LinkedListNode currNode = head;
        while (currNode.getNextNode() != null)
        {
            currNode = currNode.getNextNode();
        }
        return currNode;
    }

    public LinkedListNode getHead()
    {
        return head;
    }

    @Override
    public String toString()
    {
        LinkedListNode currNode = head;
        String toStringValue = "";
        while (currNode != null)
        {
            toStringValue += currNode.getValue() + " ";
            currNode = currNode.getNextNode();
        }
        return toStringValue;
    }
}
