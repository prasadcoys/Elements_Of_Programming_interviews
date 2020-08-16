package Array;

public class Shuffler {
    public int[] shuffle(int[] nums,int n) {
        int[] shuffledArray = new int[nums.length];
        for (int i = 0,j=n,k=0; i < n; i++,j++,k+=2) {
            shuffledArray[k] = nums[i];
            shuffledArray[k+1] = nums[j];
        }
        return shuffledArray;
    }
}
