package org.example.Exercise3;
/*
*
Exercise 3
Implement a method with signature concatenate(LinkedQueue<E> Q2) for the
LinkedQueue<E> class that takes all elements of Q2 and appends them to the end of the
original queue. The operation should run in O(1) time and should result in Q2 being an empty
queue. Write the necessary code to test the method. Hint: You may just modify the
SinglyLinkedList class to add necessary support.
(3 marks)

*/


public class LinkedQueue<E> implements Queue<E> {

    /** The primary storage for elements of the queue */
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();   // an empty  list

    /** Constructs an initially empty queue. */
    public LinkedQueue() { }                  // new queue relies on the initially empty list

    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue
     */
    @Override
    public int size() { return list.size(); }

    /**
     * Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() { return list.isEmpty(); }

    /**
     * Inserts an element at the rear of the queue.
     * @param element  the element to be inserted
     */
    @Override
    public void enqueue(E element) { list.addLast(element); }

    private void addLast(E element) {
    }

    /**
     * Returns, but does not remove, the first element of the queue.
     * @return the first element of the queue (or null if empty)
     */
    @Override
    public E first() { return list.first(); }

    /**
     * Removes and returns the first element of the queue.
     * @return element removed (or null if empty)
     */
    @Override
    public E dequeue() { return list.removeFirst(); }

    private E removeFirst() {

        return null;
    }

    /** Produces a string representation of the contents of the queue.
     *  (from front to back). This exists for debugging purposes only.
     */
    public String toString() {
        return list.toString();
    }

    public void display() {
        System.out.println(list.toString());
    }

    public void concatenate(LinkedQueue q2) {
        list.concatenate(q2.list);
        q2.list = new SinglyLinkedList<>();
    }

    public void insertAtEnd(E element) {
        enqueue(element);

    }
}