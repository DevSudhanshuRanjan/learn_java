import java.util.*;
public class basics {
    public static void main(String[] args) {
        // System.out.print("hello");
        /*
        there are multiple ways to print the values:
        .print() -> print the values but without next line. use escape sequence for that.
        println() -> prints to the next line
         */


        // ---------------Taking inputs in java---------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: "); 
        String name = sc.next(); // this would only take the words before first space occured.
        System.out.println("Hey there my name is: " + name);
        // If you want to take the full line including spaces, you can use sc.nextLine() method.
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("My full name is: " + fullName);

        sc.close(); // we close the scanner object after use to avoid memory leaks.

        /*
        list of input methods in java:
        sc.nextInt() -> for integer inputs
        sc.nextFloat() -> for float inputs
        sc.nextDouble() -> for double inputs
        sc.nextBoolean() -> for boolean inputs
        sc.nextLong() -> for long inputs
        sc.next() -> for single word string inputs
        sc.nextLine() -> for multi word string inputs
        
         */
    }
}