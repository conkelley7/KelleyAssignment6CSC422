package com.ckelley.kelley422week6;

/**
 *
 * @author conke
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testConstructor() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.empty());
    }

    @Test
    void testConstructorWithParameter() {
        Stack<String> stack = new Stack<>(10);
        assertTrue(stack.empty());
    }

    @Test
    void testPush() {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        assertFalse(stack.empty());
        assertEquals(2, stack.peek());
    }

    @Test
    void testPop() {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }

    @Test
    void testPopEmptyStack() {
        Stack<Integer> stack = new Stack<>(5);
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void testPeekEmptyStack() {
        Stack<Integer> stack = new Stack<>(5);
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    void testPushFullStack() {
        Stack<Integer> stack = new Stack<>(2);
        stack.push(1);
        stack.push(2);
        assertThrows(FullStackException.class, () -> stack.push(30));
    }

    @Test
    void testEmpty() {
        Stack<Integer> stack = new Stack<>(5);
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
    }
}
