package org.example.Exercise3;

public class Exercise3TestClass {
            public static void main(String[] args) {
                LinkedQueue<Integer> originalQueue = new LinkedQueue();
                LinkedQueue<Integer> Q2 = new LinkedQueue();

                // Add some elements to list1
                originalQueue.insertAtEnd(10);
                originalQueue.insertAtEnd(20);
                originalQueue.insertAtEnd(30);

                // Add some elements to list2
                Q2.insertAtEnd(40);
                Q2.insertAtEnd(50);

                System.out.println();
                System.out.print("originalQueue before concatenate: ");
                originalQueue.display();


                System.out.println();
                System.out.print("Q2 before concatenate: ");
                Q2.display();

                originalQueue.concatenate(Q2);
                System.out.println();
                System.out.print("originalQueue after concatenate : ");
                originalQueue.display();

                System.out.println();
                System.out.print("Q2 after concatenate is empty! ");
                Q2.display();
                System.out.println();
                System.out.println("Time Complexity O(1) No loops, no traversal");
            }
        }


