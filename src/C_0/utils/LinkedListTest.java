package C_0.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LinkedListTest
{

    @Test
    public void testIfAddingNodeToEmptyLinkedListWorks()
    {
        LinkedListNode nodeA = new LinkedListNode(1);
        MyLinkedList list = new MyLinkedList();
        list.add(nodeA);
        assertEquals(nodeA,list.getHead());
        assertEquals(1, nodeA.getValue());
    }

    @Test
    public void testIfAddingMultipleNodesToEmptyLinkedListWorks()
    {
        LinkedListNode nodeA = new LinkedListNode(1);
        LinkedListNode nodeB = new LinkedListNode(1);
        MyLinkedList list = new MyLinkedList();
        list.add(nodeA);
        list.add(nodeB);
        assertEquals(nodeA,list.getHead());
        assertEquals(nodeB,list.getLastNode());
    }

    @Test
    public void testIfAddingThreeNodesToEmptyLinkedListWorks()
    {
        LinkedListNode nodeA = new LinkedListNode(1);
        LinkedListNode nodeB = new LinkedListNode(2);
        LinkedListNode nodeC = new LinkedListNode(3);
        MyLinkedList list = new MyLinkedList();
        list.add(nodeA);
        list.add(nodeB);
        list.add(nodeC);
        assertEquals(nodeA,list.getHead());
        assertEquals(nodeA.getNextNode(),nodeB);
        assertEquals(nodeB.getNextNode(),nodeC);
        assertEquals(nodeC.getNextNode(),null);
        assertEquals(nodeC,list.getLastNode());
    }

    @Test
    public void testIfHasNextWorks()
    {
        MyLinkedList list = new MyLinkedList();
        LinkedListNode node = new LinkedListNode(1);
        assertFalse(node.hasNext());
        LinkedListNode node1 = new LinkedListNode(2);
        list.add(node);
        list.add(node1);
        assertTrue(node.hasNext());
        assertFalse(node1.hasNext());
    }



}
