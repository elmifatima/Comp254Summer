/*

Date: June-06-17
Course: Comp254
Professor: Sohaib Mohiuddin

* Exercise 1
Create a recursive algorithm to compute the product of two positive integers, m and n, using
only addition and subtraction. Implement the Java or Python code. Hint: You need subtraction to
count down from m or n and addition to do the arithmetic needed to get the right answer. Check
linearSum method from Week 5 examples
* */


public class Exercise1 {

    public static int multiply(int m, int n) {
        System.out.println("Entering multiply(" + m + ", " + n + ")");

        if (n == 0)  {// check if n is equal to 0  //base case
            System.out.println("Base case reached: returning 0");
            return 0; // do nothing
    }

        int result = m + multiply(m, n - 1);   // recursive case add m, n times

            System.out.println("Returning from multiply("+m +", "+n +"): "+m +" + multiply("+m +", "+(n -1)+") = "+result);
             return result;
        }


    public static void main(String[] args){
        int result = multiply(4,5);
        System.out.println("Final result: " + result);
        //System.out.println(multiply(7,4));
    }
}
