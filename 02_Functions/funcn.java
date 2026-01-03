public class funcn {

    // here the public static is a acess modifier. will learn more about this in
    // oops, till then just remember this syntax

    public static void greet() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        greet(); // function call
    }
}

/*
Differecne between function and method:
1. A function is a block of code that performs a specific task and can be called independently, whereas a method is a function that is associated with an object or class. 
2. Functions are typically defined outside of classes, while methods are defined within classes.
3. Functions can be called directly by their name, while methods are called on objects or classes using dot notation.
In cpp we can make functions outside of classes but in java every function has to be inside a class, so basically all functions in java are methods.

=> java always sends the variables by value, never by reference.

=> Function Overloading: In Java, function overloading is a feature that allows a class to have multiple methods with the same name but different parameter lists (different type, number, or both). The correct method to be called is determined at compile time based on the arguments passed during the method call.
 */