package introduction;

public class Main {

    public static void main(String[] args) {
        //class is a named group of properties and functions.
        // a class is a template of an object. it is a logical construct. (construct means building something)
        // an object is an instance of a class. (instance means copy of the class with actual/real values). It occupies space in memory.
        // objects are characterized by three essential properties:
        // state (attributes/properties) -> like what color, size, shape etc.
        // behavior (methods/functions) -> like what it can do
        // identity (unique name/ID) -> like how to identify the object uniquely, like student s1, s2 etc.
        // objects are stored in heap memory. and the reference of the object is stored in stack memory.
        // the dot operator(.) is used to access the properties and methods of the object. that is it links the name of the object with the name of an instance variable or method.
        // formally dot operator is formally categorized as a separator.

        Student s1 = new Student();
//        System.out.println(s1); // it will print the reference of the object.
//        System.out.println(s1.name); // for the non - preemptive data types, the default value is null.
//        System.out.println(s1.rollno); // for the preemptive data types, the default value is 0.
//        System.out.println(s1.marks); // for this data types, the default value is 0.0.
        s1.name = "Sudhanshu Ranjan";
        s1.rollno = 101;
        s1.marks = 98.5f;

        // now if we want to make sure that whenever we create a new object then only in one line all the properties are assigned values then we use constructor.
        // constructor is a special type of method which is used to initialize the object.
        // constructor name is same as the class name.
        // since initially we have not defined any constructor so java compiler provides a default constructor. which is a no-argument constructor. here Student() is a default constructor.

        /*
        Student s2 = new Student("Mayank Kumar", 102, 95.0f);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks);
        now why this is not working as giving the error that need no arguments but given 3.
        because we have not defined any constructor which takes 3 arguments. so to make this work we need to define a parameterized constructor in the Student class.

         */

        Student s3 = new Student("Mayank Kumar", 102, 95.0f);
        System.out.println(s3.name);
        System.out.println(s3.rollno);
        System.out.println(s3.marks);

        Student s4 = new Student();// this will call the no-argument constructor and take the by default values that are given there. but if you remove the no-argument constructor then it will give an error.
        // Concept of constructor overloading is also there in java. that is we can have multiple constructors with different parameters.

        Student s5 = new Student(s1); // this will call the copy constructor and copy the values from s1 to s5.
        System.out.println(s5.name);
        System.out.println(s5.rollno);
        System.out.println(s5.marks);


        Student s6 = s1; // this will copy the reference of s1 to s6. that is both s1 and s6 will point to the same object in the heap memory. it is just the reference to the same object initally created by s1 in heap memory. It is not creating or copying the object. Also the change to the one will also be reflected to the other one.




    }



}

class Student {
    String name;
    int rollno;
    float marks;

    // creating a constructor on our own
    Student() {
        this.name = "Sudhanshu Ranjan";
        this.rollno = 101;
        this.marks = 98.5f;
        // what happens in this case is whenever we create a new object of Student class then this constructor is called and the properties are initialized with the given values.
    }

    // creating a parameterized constructor
    Student(String name, int rollno, float marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        // here this.name refers to the instance variable name and name refers to the parameter of the constructor.
    }

    void greetings(){
        System.out.println("Hello, my name is " + this.name);
    }

    // now lets understand the use of this keyword
    // this keyword is a reference variable that refers to the current object.
    // it is used to differentiate between the instance variables and the parameters when they have the same name.

    // creating a constructor such that it takes values from the other object and put it there.
    Student(Student other_student){
        this.name = other_student.name;
        this.rollno = other_student.rollno;
        this.marks = other_student.marks;
    }

    // point to be noted here is that there is no return type for constructor not even void.


}