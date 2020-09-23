package Array;

public class GoodPairs {
    public int combinationTwo(int num) {

        return (num * (num-1))/2;
    }

    public int numIdenticalPairs(int[] nums) {
        int numPairs = 0;
        int[] numbersMap = new int[101];

        for (int num : nums) {
            numbersMap[num]++;
        }
        for ( int i = 1;i<= 100;i++){
            if (numbersMap[i]>1){
                numPairs+=combinationTwo(numbersMap[i]);
            }
        }
        return numPairs;
    }
}
