package BitManipulation;

public class DifferenceFinder {
    public char findTheDifference(String s, String t) {
        char[] schars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sCharXor = 0;
        for (char schar : schars) {
            sCharXor ^= (schar);
        }
        for (char tchar : tChars) {
            sCharXor ^= (tchar);
        }
        return (char) sCharXor;
    }
}
