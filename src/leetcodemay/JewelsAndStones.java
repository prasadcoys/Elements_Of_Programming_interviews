package leetcodemay;

public class JewelsAndStones {
    public int numJewelsInStones(String j, String s) {
        boolean[] jewelsMap = new boolean[ 58 ];
        int numberOfJewelsInStones = 0;
        for (char jewel : j.toCharArray()) {
            jewelsMap[jewel%65] = true;
        }
        for (char stone:
             s.toCharArray()) {
            if (jewelsMap[stone%65]){
                numberOfJewelsInStones++;
            }
        }

        return numberOfJewelsInStones;
    }
}
