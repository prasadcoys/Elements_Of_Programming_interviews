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
}
