import util.Parenthesis;
import util.StackUtil;

public class ParenthesisParser {
    private final char[] expression;
    private StackUtil stack;
    private Parenthesis parenthesis;

    public ParenthesisParser(String expression) {
        parenthesis = new Parenthesis();
        stack = new StackUtil();
        this.expression = expression.toCharArray();
    }

    public boolean areParenthesisBalanced(){
        for(char literal : expression)
        {
            if (parenthesis.isOpenParenthesis(literal)) {
                //Push open parenthesis to stack
                stack.push(literal);
            }
            if (parenthesis.isCloseParenthesis(literal)) {
                //If there is no opening Parenthesis for current literal
                if (stack.isEmpty())
                    return false;

                char poppedLiteral = stack.pop();
                // If the closing parenthesis does has no matching opening parenthesis,which was stored in stack
                if (parenthesis.getMatchingParenthesis(poppedLiteral) != literal)
                    return false;
            }
        }

        //If any open parenthesis left
        if (!stack.isEmpty())
            return false;

        //else expression has balance parenthesis
        return true;
    }

    public int getCharArrayLength() {
        return expression.length;
    }
}
