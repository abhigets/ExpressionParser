package util;

import java.util.HashMap;
import java.util.Map;

public class Parenthesis {
    String openParenthesis = "([{";
    String closeParenthesis = ")]}";
    Map matchingParenthesis;

    public Parenthesis(){
        matchingParenthesis = new HashMap();
        matchingParenthesis.put( '(' , ')' );
        matchingParenthesis.put( '[' , ']' );
        matchingParenthesis.put( '{' , '}' );
    }

    public boolean isOpenParenthesis(char literal) {
        if (openParenthesis.indexOf(literal)!= -1)
            return true;
        return false;
    }

    public String getOpenParenthesis() {
        return openParenthesis;
    }

    public boolean isCloseParenthesis(char literal) {
        if (closeParenthesis.indexOf(literal) != -1)
            return true;
        return false;
    }

    public String getCloseParenthesis() {
        return closeParenthesis;
    }

    public char getMatchingParenthesis(char literal) {
        return matchingParenthesis.get(literal).toString().charAt(0);
    }
}
