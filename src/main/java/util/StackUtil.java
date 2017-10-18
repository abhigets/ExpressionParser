package util;

import java.util.Stack;

public class StackUtil {
    Stack<Character> stack;

    public StackUtil()
    {
        stack = new Stack<Character>();
    }

    public boolean isStackCreated(){
        if (stack.getClass().toString().contains("class java.util.Stack"))
            return true;
        else
            return false;
    }

    public Character push(char literal) {
        return stack.push(literal);
    }

    public char pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
