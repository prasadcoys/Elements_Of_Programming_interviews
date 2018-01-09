package C_0.utils;

public class LinkedListNode
{
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int i)
    {
        this.value = i;
        this.next = null;
    }

    public LinkedListNode getNextNode()
    {
        return next;
    }

    public void setNextNode(LinkedListNode nextNode)
    {
        this.next = nextNode;
    }

    public boolean hasNext()
    {
        return this.next !=null;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return getValue()+"";
    }
}
