package org.example.Exercise2;

public interface Stack<E>{

    // returns # of elements
    int size();

    // check if stack is empty

    boolean isEmpty();

    // inserts elements to top
    void push(E element);

    // removes and returns the top element
    E pop();

    // returns, but does not remove element at top
    E top();
}
