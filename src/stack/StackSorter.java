package stack;

import java.util.Stack;

public class StackSorter {
    public static void sort(Stack<Integer> stack) {

        Integer top = stack.pop();
        if(top < stack.peek())
        {
            Integer temp = stack.pop();
            stack.push(top);
            stack.push(temp);
        }

    }

    public static void sortedPush(int i, Stack<Integer> stack) {

        if(stack.empty())
        {
            stack.push(i);
            return;
        }
        int topElement = stack.pop();
        if(topElement>=i)
        {
            StackSorter.sortedPush(i,stack);
            stack.push(topElement);
        }
        else
        {
            stack.push(topElement);
            stack.push(i);
        }
    }
}
