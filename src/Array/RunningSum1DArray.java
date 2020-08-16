package Array;

public class RunningSum1DArray {
    public int[] runningSum(int[] a) {
        int[] sum = new int[a.length];
        sum[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            sum[i] = a[i]+sum[i-1];
        }
        return sum;
    }
}
