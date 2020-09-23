package Array;

public class ShuffleString {
    public String restoreString(String s, int[] indexes) {
        char[] chars = new char[indexes.length];
        char[] sChars = s.toCharArray();
        int i = 0;
        for (int index : indexes) {
            chars[index] = sChars[i];
            i++;
        }
        return String.valueOf(chars);
    }
}
