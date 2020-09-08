package BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class SetBitsPrimeNumber {
    Map<Integer,Boolean> memo = new HashMap<>();
    public SetBitsPrimeNumber(){
        memo.put(2, true);
        memo.put(3, true);
        memo.put(5, true);
        memo.put(7, true);
        memo.put(11, true);
        memo.put(13, true);
        memo.put(17, true);
        memo.put(19,true);

    }
    public boolean isPrime(int num) {
        return memo.containsKey(num);
    }

    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L;i<=R;i++){
            result += isPrime(OneBitComparator.getNumberOfOnes(i))?1:0;
        }
        return result;
    }
}
