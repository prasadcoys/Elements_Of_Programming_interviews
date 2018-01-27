package C_0.utils;

public class AnagramTester
{
    public static boolean testIfBothAreAnagrams(String string1, String
            string2)
    {
        boolean isAnagram = true;
        if(string1.length()!= string2.length())
        {
            return false;
        }
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        int[] lookupRegister1 = new int[256];
        int[] lookupRegister2 = new int[256];

        for(char character : charArray1)
        {
            lookupRegister1[character]++;
        }
        for(char character : charArray2)
        {
            lookupRegister2[character]++;
        }
        for(char character : charArray2)
        {
            if(lookupRegister1[character] == lookupRegister2[character])
            {
                isAnagram &= true;
            }
            else
            {
                isAnagram &= false;
            }
        }

        return isAnagram;
    }
}
