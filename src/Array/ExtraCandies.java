package Array;

import java.util.ArrayList;
import java.util.List;

public class ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> output = new ArrayList<>();
        for (int candy : candies) {
            max= Math.max(candy,max);
        }
        for (int candy : candies) {
            if (candy+extraCandies >= max){
                output.add(Boolean.TRUE);
            }
            else {
                output.add(Boolean.FALSE);
            }
        }
        return output;
    }
}
