import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RPNExpressionTest {

    @Test
    public void testIfTokensOfRPNAreResolved() {
        String rpnExpression = "1,2,+";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(rpnExpression);
        String[] tokens = rpnParser.getTokens();
        String[] expectedTokens = new String[3];
        expectedTokens[0] = "1";
        expectedTokens[1] = "2";
        expectedTokens[2] = "+";
        assertEquals(expectedTokens, tokens);
    }

    @Test
    public void testIFASimpleExpressionIsSolvedCorrectly() {
        String rpnExpression = "1,2,+";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(rpnExpression);
        int expressionValue = rpnParser.solveExpression();
        assertEquals(3, expressionValue);

    }

    @Test
    public void testIfAnAdditionWithMoreThanTwoOperandsWorks() {
        String rpnExpression = "1,2,3,+,+";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(rpnExpression);
        int expressionValue = rpnParser.solveExpression();
        assertEquals(6, expressionValue);
    }

    @Test
    public void testIfSubtractionOfTwoNumbersWorks() {
        String rpnExpression = "2,3,-";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(rpnExpression);
        int expressionValue = rpnParser.solveExpression();
        assertEquals(1, expressionValue);
    }

    @Test
    public void testIfSubtractionAndAdditionInSameStatementWorks() {
        String rpnExpression = "1,2,3,-,+";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(rpnExpression);
        int expressionValue = rpnParser.solveExpression();
        assertEquals(2, expressionValue);
    }

    @Test
    public void testIfAdditionOfPrefixNotationWorks() {
        String prefixExpression = "+,1,2";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(prefixExpression);
        int expressionValue = rpnParser.solvePrefixExpression();
        assertEquals(3, expressionValue);
    }

    @Test
    public void testIfAdditionOfPrefixNotationWithMoreThanTwoOperandsWorks() {
        String prefixExpression = "+,+,1,2,8";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(prefixExpression);
        int expressionValue = rpnParser.solvePrefixExpression();
        assertEquals(11, expressionValue);
    }

    @Test
    public void testIFAdditionAndSubtractionWorks() {
        String prefixExpression = "+,-,2,1,8";
        RPNExpressionSolver rpnParser = new RPNExpressionSolver(prefixExpression);
        int expressionValue = rpnParser.solvePrefixExpression();
        assertEquals(9, expressionValue);
    }

}
