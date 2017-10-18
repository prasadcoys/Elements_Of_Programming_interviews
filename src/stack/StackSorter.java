package stack;

import java.util.Stack;

public class StackSorter {

    private static int stepCounter = 0;

    public static void sort(Stack<Integer> stack) {

        Integer top = stack.pop();
        if (!stack.empty()) {
            sort(stack);

        }
        sortedPush(top, stack);


    }

    public static void sortedPush(int i, Stack<Integer> stack) {
        if (stack.empty()) {
            stack.push(i);
            return;
        }
        int topElement = stack.pop();
        if (topElement >= i) {
            StackSorter.sortedPush(i, stack);
            stack.push(topElement);
        } else {
            stack.push(topElement);
            stack.push(i);
        }
    }
}
