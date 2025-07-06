package org.example.Exercise1;

import java.util.Iterator;

    public interface PositionalList<E> extends Iterable<E> {

        // returns # of elements
        int size();

        // checks if list is empty
        boolean isEmpty();

        // returns first position of list
        Position<E> first();

        // returns last position of list
        Position<E> last();

        Position<E> before(Position<E> p) throws IllegalArgumentException;

        Position<E> after(Position<E> p) throws IllegalArgumentException;

        // add element in front
        Position<E> addFirst(E e);

        // add element at back of list
        Position<E> addLast(E e);

        // add before given position
        Position<E> addBefore(Position<E> p, E e)
                throws IllegalArgumentException;

        //add after given position
        Position<E> addAfter(Position<E> p, E e)
                throws IllegalArgumentException;

        // replaces element at given position
        E set(Position<E> p, E e) throws IllegalArgumentException;

        //removes element at given position
        E remove(Position<E> p) throws IllegalArgumentException;


        // returns iterator
        Iterator<E> iterator();

       // returns postion of list
        Iterable<Position<E>> positions();


        // method
        int indexOf(Position<E> p);


    }



