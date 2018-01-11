package C_0;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaxElementInStackTest
{

    @Test
    public void testIfMAxFinderGetsMaxElementIfItIsSecond()
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        assertEquals(5,MaxFinder.getMaxElement(stack));
        assertTrue(!stack.isEmpty());

    }

    @Test
    public void testIfMAxFinderGetsMaxElementIfItIsLast()
    {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        assertEquals(5,MaxFinder.getMaxElement(stack));
    }

    @Test
    public void testIfMAxFinderGetsMaxElementIfItIsFirst()
    {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5,MaxFinder.getMaxElement(stack));
    }
}
