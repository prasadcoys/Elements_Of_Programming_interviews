package leetcodemay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {


    Stack<Integer> pricesStack = new Stack<>();
    Stack<Integer> weightages = new Stack<>();

    public int next(int price) {
        int span = 1;
        if (pricesStack.isEmpty()){
            pricesStack.push(price);
            weightages.push(span);
            return span;
        }
        else if (pricesStack.peek()>price){
            pricesStack.push(price);
            weightages.push(span);
            return span;
        }
        while (!pricesStack.isEmpty() && pricesStack.peek()<=price){
            pricesStack.pop();
            span += weightages.pop();
        }
        pricesStack.push(price);
        weightages.push(span);
        return span;
    }
}
