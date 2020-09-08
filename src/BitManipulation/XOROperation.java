package BitManipulation;

public class XOROperation {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 0, num = start+2; i < n-1; i++,num+=2) {
            result ^= num;
        }
        return result;
    }
}
