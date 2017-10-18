package stack;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class StackSortTest {

    @Test
    public void testIfStackWithTwoElementsIsSortedInDescendingOrder(){

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);

        StackSorter.sort(stack);
        assertEquals(new Integer(2),stack.peek());


    }

    @Test
    public void testIfInsertIntoStackWithOnlyTwoElementsWorksCorrectly()
    {
        Stack<Integer> stack = new Stack<>();

        StackSorter.sortedPush(2,stack);
        StackSorter.sortedPush(1,stack);

        assertEquals(Integer.valueOf(2),stack.pop());
        assertEquals(Integer.valueOf(1),stack.pop());
    }

    @Test
    public void testIfInsertIntoStackWithMoreThanTwoElementsWorksCorrectly()
    {
        Stack<Integer> stack = new Stack<>();
        StackSorter.sortedPush(4,stack);
        StackSorter.sortedPush(3,stack);
        StackSorter.sortedPush(3,stack);
        StackSorter.sortedPush(2,stack);
        StackSorter.sortedPush(1,stack);
        assertEquals(Integer.valueOf(4),stack.pop());
        assertEquals(Integer.valueOf(3),stack.pop());
        assertEquals(Integer.valueOf(3),stack.pop());
        assertEquals(Integer.valueOf(2),stack.pop());
        assertEquals(Integer.valueOf(1),stack.pop());
    }

}
