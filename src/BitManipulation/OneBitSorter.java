package BitManipulation;

import java.util.Arrays;
import java.util.Comparator;

public class OneBitSorter {



    public int[] sortByBits(int[] arr) {
        Integer[] newArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr, new OneBitComparator());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
        return arr;
    }


}


