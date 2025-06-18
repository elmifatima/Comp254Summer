import java.util.Scanner;

/*

Date: June-06-17
Course: Comp254
Professor: Sohaib Mohiuddin

Exercise 2
Write a short recursive Java method that determines if a string s is a palindrome, that is, it is equal
to its reverse. Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'. Test the
method by asking the user to provide string entries to be checked. Hint: Check the equality of
the first and last characters and recur (but be careful to return the correct value for both odd and
even-length strings)
* */

public class Exercise2 {

    // create method to see if it is a palindrome
    public static boolean isPalindrome(String s) {

        if (s.length() <= 1) {
            return true;  //base case
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;  // not a match
        } else {
            return isPalindrome(s.substring(s.length() - 1));
        }
    }

    //call method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // initiat scanner
        System.out.println("Enter string to check if it is a palindrome" ); // print question for input

        String input = scanner.nextLine();  // read question from unput
        if (isPalindrome(input)) {
            System.out.println(" yes '" + "'is a palindrome.\n");

        } else {
            System.out.println(" NOP '" + "'is not a palindrome.\n");
        }

        scanner.close();
    }
}
