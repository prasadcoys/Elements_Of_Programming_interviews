package BitManipulation;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xorValue = x ^ y;
        int hammingDistance = 0;
        while ( xorValue >0){
            hammingDistance +=  xorValue % 2 != 0 ? 1:0;
            xorValue = xorValue >> 1;
        }
        return hammingDistance;
    }
}
