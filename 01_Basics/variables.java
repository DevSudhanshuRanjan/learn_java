public class variables {
    /*
     * 1. java is typed language which means we have to define the data type of the
     * language.
     * 2. - DataTypes in Java:
     * - Primitive ➖
     * - byte - store the numbers but have a range of only 256. range from -128 to
     * 127 all whole numbers.
     * - short
     * - char - stores only single characters like ‘a’ not ‘ab’ → ‘ab’ is considered
     * as string here.
     * - boolean
     * - int
     * - long
     * - float
     * - double
     * - Non-Primitive ➖
     * - Sting
     * - Array
     * - Class
     * - Object
     * - Interface
     */

    public static void main(String[] args) {
        byte a = 8;
        System.out.println(a);

        /*
         * type conversion in java:
         * 1. Widening ➖ converting a smaller data type to a larger data type.
         * - byte -> short -> char -> int -> long -> float -> double
         * here for ex. we can convert int to long but not long to int directly.
         * - this is done automatically in java.
         * 2. Narrowing ➖ converting a larger data type to a smaller data type. this is
         * called lossy conversion.
         * 
         * - double -> float -> long -> int -> char -> short -> byte
         * - this is done manually in java by type casting.
         * - for ex. int a = (int) 3.14; // here we are converting double to int
         * manually.
         * 
         * 3. Type promotion in expressions ➖
         * - Java automatically promotes each byte, short, or char operand to int when
         * evaluating an expression.
         * 
         * - If one of the operands is of type long, float, or double, the whole
         * expression is promoted to that type.
         * For example:
         * byte b = 10;
         * char c = 'A';
         * int i = 100;
         * long l = 1000L;
         * float f = 10.5f;
         * double d = 20.99;
         * 
         * double result = b + c + i + l + f + d; // here all are promoted to double
         * type.
         * 
         */

        byte b = 2;
        b = 2 * 5; // this should give us 10 but it gives error because 2*5 is considered as int
                   // type.
        // to solve this we can do type casting.
        b = (byte) (2 * 5);
        System.out.println(b);
    }

}