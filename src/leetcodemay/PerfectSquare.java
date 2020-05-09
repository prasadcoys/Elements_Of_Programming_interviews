package leetcodemay;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        long min = 0;
        long max = num;
        long currentNum = num/2;

        if (num < 0) {
            return false;
        }

        if (num  < 2) {
            return true;
        }

        do {
            long currenNumSquared = currentNum * currentNum;

            if (currenNumSquared == num) {

                return true;
            } else if (currenNumSquared > num) {

                max = currentNum;

            } else  {
                min = currentNum;

            }
            currentNum = (min + max) / 2;
        } while (currentNum != min && currentNum != max);
        return false;
    }
}
