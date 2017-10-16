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
}
