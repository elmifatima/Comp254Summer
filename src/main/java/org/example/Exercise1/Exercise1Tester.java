package org.example.Exercise1;

public class Exercise1Tester {

    public static void main(String[] args) {
        LinkedPositionalList<String>list = new LinkedPositionalList<>() {};

        // Add elements
        Position<String> p1 = list.addLast("Fatima");
        Position<String> p2 = list.addLast("Ahmed");
        Position<String> p3 = list.addLast("Ifraah");

        // print list
        System.out.println("List: " + list);
        System.out.println();

        // testing indexOf
        System.out.println("Index of p1 (Fatima): " + list.indexOf(p1));
        System.out.println("Index of p2 (Ahmed): " + list.indexOf(p2));
        System.out.println("Index of p3 (Ifraah): " + list.indexOf(p3));
        System.out.println();

        //remove a position
        list.remove(p2);

        System.out.println("List after removal: " + list);


        // if position not found throw error
        try {

            System.out.println("Index of Ahmed (after removal): " + list.indexOf(p2));
        } catch (IllegalArgumentException e){
            System.out.println("Position not found in the list");
        }

    }


}
