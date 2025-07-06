package org.example.Exercise2;

public class Exercise2Tester {

    public static void main(String[] args) {
        Stack<String> S = new LinkedStack<>();
        Stack<String> T = new LinkedStack<>();

        // push elements to S
        S.push("Fatima");
        S.push("Ahmed");
        S.push("Maxamed");
        S.push("Ifraah");
        S.push("Maryama"); // top of S
        System.out.println("Pushed: " + S);


            System.out.println("Before transfering:");
            System.out.println("S :" + S);
            System.out.println("T :" + T);

            StackTransfer.transfer(S, T);

            System.out.println("\nAfter transfering: ");

        // Confirm the stack is empty
        System.out.println("Stack is now empty: " + S.isEmpty());
        System.out.println();
        System.out.println("T now contains" + T);

            // empty S
            System.out.println("S:" + S);
        // Confirm the stack is empty
        System.out.println("Stack S is now empty: " + S.isEmpty());
        System.out.println();

        System.out.println("T: now contains S content LIFO");
            // T with S names
            System.out.println("T: " + T);
        }
    }
