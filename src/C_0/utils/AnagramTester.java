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
        int[] lookupRegister1 = getIntegerArrayFromWord(string1);

        int[] lookupRegister2 = getIntegerArrayFromWord(string2);

        for(char character : string2.toCharArray())
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

    public static int[] getIntegerArrayFromWord(String string1)
    {
        char[] charArray1 = string1.toCharArray();

        int[] lookupRegister1 = new int[256];
        for(char character : charArray1)
        {
            lookupRegister1[character]++;
        }
        return lookupRegister1;
    }
}
