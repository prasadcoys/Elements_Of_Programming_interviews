package C_0;

import C_0.utils.LinkedListNode;
import C_0.utils.MyLinkedList;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SortedListsMergerTest
{

    @Test
    public void testIfMergingSortedListsWorks()
    {
        LinkedListNode nodeTwo = new LinkedListNode(2);
        LinkedListNode nodeThree = new LinkedListNode(3);
        LinkedListNode nodeFive = new LinkedListNode(5);
        LinkedListNode nodeSeven = new LinkedListNode(7);
        LinkedListNode nodeEight = new LinkedListNode(8);
        MyLinkedList listA = new MyLinkedList();
        listA.add(nodeTwo);
        listA.add(nodeFive);
        listA.add(nodeSeven);
        MyLinkedList listB = new MyLinkedList();
        listB.add(nodeThree);
        listB.add(nodeEight);
        SortedListsMerger.merge(listA,listB);
        assertEquals("2 3 5 7 8 ",listA.toString());
    }

    @Test
    public void
    testIfMergingSortedListsWorksIfTheEntireSecondListIsSmaller()
    {
        LinkedListNode nodeTwo = new LinkedListNode(2);
        LinkedListNode nodeThree = new LinkedListNode(3);
        LinkedListNode nodeFive = new LinkedListNode(5);
        LinkedListNode nodeSeven = new LinkedListNode(7);
        LinkedListNode nodeEight = new LinkedListNode(8);
        LinkedListNode nodeNine = new LinkedListNode(9);
        LinkedListNode nodeTen = new LinkedListNode(10);
        MyLinkedList listA = new MyLinkedList();
        listA.add(nodeSeven);
        listA.add(nodeEight);
        listA.add(nodeNine);
        MyLinkedList listB = new MyLinkedList();
        listB.add(nodeTwo);
        listB.add(nodeThree);
        listB.add(nodeFive);
        listB.add(nodeTen);
        SortedListsMerger.merge(listA,listB);
        assertEquals("2 3 5 7 8 9 10 ",listA.toString());
    }
}
