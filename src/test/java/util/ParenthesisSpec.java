package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesisSpec {

    @Test
    public void verifyIfOpenParenthesis() throws Exception {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals(true,parenthesis.isOpenParenthesis('('));
    }

    @Test
    public void verifyOpenParenthesisList() throws Exception {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals("([{", parenthesis.getOpenParenthesis());
    }

    @Test
    public void verifyIfCloseParenthesis() throws Exception {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals(true,parenthesis.isCloseParenthesis(')'));
    }

    @Test
    public void verifyCloseParenthesisList() throws Exception {
        Parenthesis parenthesis = new Parenthesis();
        assertEquals(")]}",parenthesis.getCloseParenthesis());
    }

    @Test
    public void verifyEveryOpenParenthesisHasAMatchingClosingParenthesis() throws Exception {
        int i = 0;
        Parenthesis parenthesis = new Parenthesis();
        char[] allOpenParenthesis = parenthesis.getOpenParenthesis().toCharArray();
        char[] allCloseParenthesis = parenthesis.getCloseParenthesis().toCharArray();

        assertEquals(allCloseParenthesis.length,allCloseParenthesis.length);

        //verify each open parenthesis has corresponding closing parenthesis
        for (char currentParenthesis : allOpenParenthesis) {
            assertEquals(allCloseParenthesis[i],parenthesis.getMatchingParenthesis(currentParenthesis));
            i++;
        }
    }
}