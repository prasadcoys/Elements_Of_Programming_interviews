package stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WellFormedStringTest {

    @Test
    public void testNothing() {

    }

    @Test
    public void testIfStringWithOnlyOpeningAndClosingBracesPassesCorrectly() {
        String expression = "{,}";
        assertTrue(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithTwoClosingBracesPassesCorrectly() {
        String expression = "},}";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithTwoOpeningBracesPassesCorrectly() {
        String expression = "{,{";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithOpeningAndClosingBracesInTheWrongOrderFails() {
        String expression = "},{";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithMultipleSymbolsPassesCorrectly() {
        String expression = "{,(,),}";
        assertTrue(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithMultipleSymbolsAndInternalSymbolHasIssuePassesCorrectly() {
        String expression = "{,(,}";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithMultipleSymbolsAndInternalSymbolHasIssue2PassesCorrectly() {
        String expression = "{,(,(,}";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithMultipleSymbolsAndInternalSymbolHasIssue3PassesCorrectly() {
        String expression = "{,(,},)";
        assertFalse(WellFormedStringValidator.isWellFormedString(expression));
    }

    @Test
    public void testIfStringWithMultipleSymbolsAndInternalSymbolHasIssue4PassesCorrectly() {
        String expression = "{,},(,)";
        assertTrue(WellFormedStringValidator.isWellFormedString(expression));
    }


}
