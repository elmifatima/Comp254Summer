import java.io.File;
import java.util.Scanner;

import static java.lang.String.format;



/*

Date: June-06-17
Course: Comp254
Professor: Sohaib Mohiuddin

Exercise 3
Implement a recursive method with calling signature find(path, filename) that reports all entries
of the file system rooted at the given path having the given file name. Test the method with a real
path, filename from your file system. Hint: Review use of the java.io.File class and the week 5
examples
* */

public class Exercise3 {

    public static long diskUsage(File root) {
        long total = root.length();                          // start here disk usage
        if (root.isDirectory()) {                            // check if this is a directory,
            for (String childname : root.list()) {             // then for each child
                File child = new File(root, childname);          //  full path to child
                total += diskUsage(child);                       // add child's usage to total
            }
        }

        //formated output
        System.out.println(formatSize(total) + "\t" + root);
        return total;
    }
        // declare fomatesize method
        public static String formatSize(long bytes){ // parameter bytes long
            if (bytes < 1024) return bytes + "B";  // if less than 1024 add B
            int exp = (int) (Math.log(bytes) / Math.log(1024));
            String unit = String.valueOf("KMGTYPE".charAt(exp -1)) + "B";  // calculate unites kb, mb, or gb
            return format("%.2f %s" , bytes / Math.pow(1024, exp), unit);  //include bytes in unites
        }


        //System.out.println(total + "\t" + root);             // descriptive output
        //return total;                                        // return the grand total

    //command line method
    public static void main(String[] args) {
        String start;
        if (args.length > 0) {
            start = args[0]; // enter the path on commandline as argument
        } else {
            System.out.print("Enter the starting location: ");
            start = new Scanner(System.in).next(); // read the input
        }
        diskUsage(new File(start));  // call method
    }


}


