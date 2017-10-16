package stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertNotNull;

public class StackTest {

    @Test
    public void testIfStackWorks() {
        stack.Stack stack = new stack.Stack();
        assertNotNull(stack);
        assertNotNull(stack);

    }

    @Test
    public void testIfPushToAStackWorks() {
        stack.Stack stack = new stack.Stack();
        stack.push(2);
        Assert.assertEquals(2, stack.peek());
    }

    @Test
    public void testIfPopFromStackWorks() {
        stack.Stack stack = new stack.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testIfExceptionIsThrownWhilePoppingAnEmptyStack() {
        stack.Stack stack = new stack.Stack();
        stack.pop();
    }

    @Test
    public void testIfMaxWorks() {
        stack.Stack stack = new stack.Stack();
        stack.push(1);
        stack.push(5);
        stack.push(4);
        Assert.assertEquals(5, stack.max());
    }

    @Test
    public void testIfMaxWorksAfterPop() {
        stack.Stack stack = new stack.Stack();
        stack.push(5);
        stack.push(7);
        Assert.assertEquals(7, stack.max());
        stack.pop();
        Assert.assertEquals(5, stack.max());
        stack.push(6);
        Assert.assertEquals(6, stack.max());
    }

    @Test
    public void testIfMaxWorksWithDuplicateValues() {
        stack.Stack stack = new stack.Stack();
        stack.push(5);
        stack.push(5);
        Assert.assertEquals(5, stack.max());
        stack.pop();
        Assert.assertEquals(5, stack.max());
        stack.push(6);
        Assert.assertEquals(6, stack.max());
    }


}
