package com.ckelley.kelley422week6;

/**
 *
 * @author conke
 */
public class Stack<E> {
    private E[] array;
    private int top;
    private int capacity;

    public Stack() {
        this.capacity = 20;
        array = (E[]) new Object[capacity];
        top = -1;
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
        top = -1;
    }

    public E pop() {
        if (empty()) {
            throw new EmptyStackException("Stack is empty");
        }
        E item = array[top];
        top--;
        return item;
    }

    public E push(E item) {
        if (top == capacity - 1) {
            throw new FullStackException("Stack is full");
        }
        array[++top] = item;
        return item;
    }

    public E peek() {
        if (empty()) {
            throw new EmptyStackException("Stack is empty");
        }
        return array[top];
    }

    public boolean empty() {
        return top == -1;
    }
}
