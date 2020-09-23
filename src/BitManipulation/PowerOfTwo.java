package BitManipulation;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        int numOfOneBits = 0;
        while (n > 0){
            numOfOneBits ++;
            n = n & ( n-1);
        }
        return numOfOneBits == 1;
    }
}
