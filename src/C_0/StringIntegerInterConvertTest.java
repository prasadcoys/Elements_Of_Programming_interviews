package C_0;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringIntegerInterConvertTest
{

    @Test
    public void testIfSingleDigitIntegerToStringWorks()
    {
        int value = 1;
        String valueInString = StringIntegerInterConverter.convertToString
            (value);
        assertEquals("1",valueInString);
    }

    @Test
    public void testIfFourDigitIntegerToStringWorks()
    {
        int value = 1234;
        String valueInString = StringIntegerInterConverter.convertToString
                (value);
        assertEquals("1234",valueInString);

    }

    @Test
    public void testIfFourDigitNegativeIntegerToStringWorks()
    {
        int value = -1234;
        String valueInString = StringIntegerInterConverter
                .convertToString(value);
        assertEquals("-1234",valueInString);
    }

    @Test
    public void testIfZeroIsConvertedToStringProperly()
    {
        int value = 0;
        String valueInString = StringIntegerInterConverter
                .convertToString(value);
        assertEquals("0",valueInString);
    }

    @Test
    public void testIfOneDigitNumberStringIsConvertedToInteger()
    {
        String numberWord = "1";
        int valueInInt = StringIntegerInterConverter.convertToInteger
                (numberWord);
        assertEquals(1,valueInInt);
    }

    @Test
    public void testIfFourDigitNumberStringIsConvertedToInteger()
    {
        String numberWord = "1234";
        int valueInInt = StringIntegerInterConverter.convertToInteger
                (numberWord);
        assertEquals(1234,valueInInt);
    }
    @Test
    public void testIfOneDigitZeroStringIsConvertedToInteger()
    {
        String numberWord = "0";
        int valueInInt = StringIntegerInterConverter.convertToInteger
                (numberWord);
        assertEquals(0,valueInInt);
    }

    @Test
    public void testIfOneDigitNegativeNumberStringIsConvertedToInteger()
    {
        String numberWord = "-1";
        int valueInInt = StringIntegerInterConverter.convertToInteger
                (numberWord);
        assertEquals(-1,valueInInt);
    }

    @Test
    public void testIfFourDigitNegativeNumberStringIsConvertedToInteger()
    {
        String numberWord = "-1234";
        int valueInInt = StringIntegerInterConverter.convertToInteger
                (numberWord);
        assertEquals(-1234,valueInInt);
    }
}
