package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackUtilSpec {
    StackUtil stack;

    @Test
    public void testStackUtil() throws Exception {
        stack = new StackUtil();
        assertEquals(true,stack.isStackCreated());
    }

    @Test
    public void testPush() throws Exception {
        stack = new StackUtil();
        assertEquals(new Character('a'), stack.push('a'));
    }

    @Test
    public void testPop() throws Exception {
        stack = new StackUtil();
        stack.push('b');
        assertEquals('b',stack.pop());
    }

    @Test
    public void verifyIsEmptyMethod() throws Exception {
        stack = new StackUtil();
        assertEquals(true,stack.isEmpty());

        stack.push('(');
        assertEquals(false,stack.isEmpty());
    }
}