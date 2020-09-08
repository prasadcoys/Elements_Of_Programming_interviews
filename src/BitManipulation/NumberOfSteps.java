package BitManipulation;

public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int steps = 0;
        if (num == 0 ){
            return 0;
        }
        while (true){

            if (num == 1){
                return ++steps;
            }
            if (isOdd(num)){
                steps++;
            }
            num = num >> 1;
            steps++;
            System.out.println(num);
        }
    }

    private boolean isOdd(int num) {
        return ((num ^ num -1)== 1);

    }
}
