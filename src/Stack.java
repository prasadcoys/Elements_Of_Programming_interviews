package stack;

import java.util.EmptyStackException;

public class Stack {

    int[] stack = new int[5];
    int[] maxCache = new int[5];
    int currentTopPosition = -1;
    private int currentMaxPosition;

    public int getCurrentTopPosition() {
        return currentTopPosition;
    }

    public void push(int i) {
        stack[currentTopPosition + 1] = i;
        if (maxCache[currentMaxPosition] <= i) {
            maxCache[currentMaxPosition + 1] = i;
            currentMaxPosition++;
        }
        currentTopPosition++;
    }

    public int peek() {
        return stack[currentTopPosition];
    }

    public int pop() {

        if (currentTopPosition < 0) {
            throw new EmptyStackException();
        }
        if (peek() == maxCache[currentMaxPosition]) {
            currentMaxPosition--;
        }
        return stack[currentTopPosition--];
    }

    public int max() {

        return maxCache[currentMaxPosition];
    }
}
