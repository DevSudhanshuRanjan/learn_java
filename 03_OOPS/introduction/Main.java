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

        
    }
      
}

class Student {
    String name;
    int rollno;
    float marks;  
}