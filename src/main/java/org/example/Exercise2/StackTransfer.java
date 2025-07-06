package org.example.Exercise2;


// Created a class for the transfer method

public class StackTransfer {

    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }

    }
}
