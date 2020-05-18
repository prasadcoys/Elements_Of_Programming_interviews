package leetcodemay;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder("");
        int startPos = 0;
        char[] nums = num.toCharArray();

        for (int i = nums.length - k; i > 0; i--) {
            char min = nums[ startPos ];
            startPos = startPos+1;
            for (int j = startPos; j < nums.length - i + 1; j++) {
                if (nums[ j ] < min) {
                    min = nums[ j ];
                    startPos = j + 1;
                }
            }
            if ( result.length() == 0 && min == '0'){
                continue;
            }
            result.append(min);

        }
        if (result.length() > 0){
            return result.toString();
        } else {
            return "0";
        }
    }

}
