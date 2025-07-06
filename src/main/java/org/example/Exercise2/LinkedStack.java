package org.example.Exercise2;

public class LinkedStack<E> implements Stack<E>{

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }


    }

    private Node<E> top = null;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return  size == 0;
    }

    // push from S then empty S
    public void push(E element){
        top = new Node<>(element,top);
        size++;
    }

    public E pop(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        E result = top.element;
        top = top.next;
        size--;
        return result;
    }

    public E top(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");
        return top.element;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = top;
        while (current != null){
            sb.append(current.getElement());
            current = current.getNext();
            if(current!= null)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
