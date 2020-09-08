package BitManipulation;

import java.util.Comparator;

public class OneBitComparator implements Comparator<Integer> {

    public static int getNumberOfOnes(int num) {
        int result = 0;
        while (num > 0 ){
            result ++;
            num = num & (num -1);
        }
        return result;
    }

    public static int compareLogic(int x, int y) {
        int xones = getNumberOfOnes(x);
        int yones = getNumberOfOnes(y);
        if ( xones == yones){
            return x - y;
        } else {
            return xones - yones;
        }
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return compareLogic(o1,o2);
    }
}
