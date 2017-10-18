import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionParserSpec {
    ParenthesisParser parenthesisParse;

    //---------------------------------------------------Examples Test---------------------------------------------------------------

    // Example 1 : a*(([x + 2])[(y)])+2 == Valid
    @Test
    public void example1() throws Exception {
        parenthesisParse = new ParenthesisParser("a*(([x + 2])[(y)])+2");
        assertEquals(true, parenthesisParse.areParenthesisBalanced());
    }

    //Example 2 : b/((][x) == Invalid
    @Test
    public void example2() throws Exception {
        parenthesisParse = new ParenthesisParser("b/((][x)");
        assertEquals(false, parenthesisParse.areParenthesisBalanced());
    }

    //Example 3 : (5 + 2))( == Invalid
    @Test
    public void example3() throws Exception {
        parenthesisParse = new ParenthesisParser("(5 + 2))(");
        assertEquals(false, parenthesisParse.areParenthesisBalanced());
    }

    //Example 4 : ([x +2]))y(z)-5 == Invalid
    @Test
    public void example4() throws Exception {
        parenthesisParse = new ParenthesisParser("([x +2]))y(z)-5");
        assertEquals(false, parenthesisParse.areParenthesisBalanced());
    }

    //Example 5 : ([x+2) == Invalid
    @Test
    public void example5() throws Exception {
        parenthesisParse = new ParenthesisParser("([x+2)");
        assertEquals(false, parenthesisParse.areParenthesisBalanced());
    }


    //---------------------------------------------------Unit Test---------------------------------------------------------------
    @Test
    public void verifyExpressionIsConvertedToCharArray() throws Exception {
        parenthesisParse = new ParenthesisParser("a*(([x + 2])[(y)])+2");
        assertEquals(parenthesisParse.getCharArrayLength(),20);
    }
}