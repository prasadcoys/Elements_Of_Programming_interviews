package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void testIfWeCanCreateALinkedList(){
        MyLinkedList list = new MyLinkedList();
        Assert.assertNotNull(list);
    }

    @Test
    public void testIfWeCanAddAtHeadOfList(){
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        Assert.assertEquals(1,list.get(0));
        list.addAtHead(2);
        Assert.assertEquals(2,list.get(0));
        Assert.assertEquals(1,list.get(1));

    }

    @Test
    public void testIfWeCanAddAtTailOfList(){
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        Assert.assertEquals(1,list.get(0));
        list.addAtTail(2);
        Assert.assertEquals(1,list.get(0));
        Assert.assertEquals(2,list.get(1));
        list.addAtTail(3);
        Assert.assertEquals(1,list.get(0));
        Assert.assertEquals(2,list.get(1));
        Assert.assertEquals(3,list.get(2));
    }

    @Test
    public void testIfWeCanAddAtIndex(){
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0,1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtIndex(1,4);
        list.addAtIndex(4,5);
        list.addAtIndex(10,10);
        Assert.assertEquals(1,list.get(0));
        Assert.assertEquals(4,list.get(1));
        Assert.assertEquals(2,list.get(2));
        Assert.assertEquals(3,list.get(3));
        Assert.assertEquals(5,list.get(4));
        Assert.assertEquals(-1,list.get(5));
    }

    @Test
    public void testIfWeCanDeleteAtIndex(){
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.deleteAtIndex(1);
        Assert.assertEquals(1, list.get(0));
        Assert.assertEquals(3,list.get(1));
        Assert.assertEquals(4,list.get(2));



    }

    @Test
    public void testIfWeCanDeleteTheFirstElement(){
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.deleteAtIndex(0);
        Assert.assertEquals(2, list.get(0));
        Assert.assertEquals(3,list.get(1));
        Assert.assertEquals(4,list.get(2));
    }

    @Test
    public void testIfWeCanDeleteFromEmptyList(){
        MyLinkedList list = new MyLinkedList();
        list.deleteAtIndex(1);
        Assert.assertNotNull(list);
    }
}
