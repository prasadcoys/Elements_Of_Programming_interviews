package leetcodemay;

public class NumberComplement {
    public int findComplement(int num) {
        int complement = 0;
        int powerOfTwo = 1;
        while ( num >0 ){
            int i = num % 2;
            complement+=((i ^1) *powerOfTwo);
            powerOfTwo *= 2;
            num = num / 2;
        }
        return complement;
    }
}
