package C_0;

public class StringIntegerInterConverter
{
    public static String convertToString(int value)
    {
        boolean isNegative = value < 0;
        String valueString = "";
        if (value == 0)
        {
            return "0";
        }
        value = Math.abs(value);
        while (value != 0)
        {
            valueString = value % 10 + valueString;
            value /= 10;
        }
        if (isNegative)
        {
            valueString = "-" + valueString;
        }
        return valueString;
    }

    public static int convertToInteger(String numberWord)
    {
        char[] wordCharArray;
        if (numberWord.startsWith("-"))
        {
            wordCharArray = numberWord.substring(1).toCharArray();
        } else
        {
            wordCharArray = numberWord.toCharArray();
        }
        int value = 0;
        int asciiValueOfZero = '0';
        for(int i = wordCharArray.length-1;i>=0;i--)
        {
            //value = wordCharArray[i].
        }
        return value;
    }
}
