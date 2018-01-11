package C_0;

import stack.Stack;

public class MaxFinder
{
    static int maxElement;

    public static int getMaxElement(Stack stack)
    {
        maxElement = stack.peek();
        getMax(stack);
        return maxElement;
    }

    private static void getMax(Stack stack)
    {
        if (stack.isEmpty())
        {
            return;
        }
        int currentElement = stack.pop();
        if (maxElement < currentElement)
        {
            maxElement = currentElement;
        }
        getMax(stack);
        stack.push(currentElement);

    }
}
