package leetcodemay;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {


    List<Integer> prices = new ArrayList<>();
    List<Integer> spans = new ArrayList<>();



    public int next(int price) {
        prices.add(price);
        int span = 1;
        for (int i = prices.size()-2; i >=0 ;) {

            Integer item = prices.get(i);
            if(price< item){
                break;
            }
            Integer spanOfElement = spans.get(i);
            span+= spanOfElement;
            i-= spanOfElement;

        }

        spans.add(span);
        return span;
    }
}
