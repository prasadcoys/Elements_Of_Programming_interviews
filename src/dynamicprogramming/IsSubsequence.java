package dynamicprogramming;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if ( s.length()>t.length()){
            return false;
        }
        char[] tchars = t.toCharArray();
        int i = 0;
        for (char schar : s.toCharArray()) {
            for(;;i++){
                if (i==tchars.length){
                    return false;
                }
                if (schar == tchars[i]){
                    i++;
                    break;
                }
            }
        }
        return true;
    }
}
