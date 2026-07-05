package Example_14;

// Class implementing Cloneable
// Loaded into: Method Area
class Student implements Cloneable {

    // Instance Variables
    // Stored in: Heap (inside object)
    String name;
    int stno;

    // Constructor
    public Student(String name, int stno) {
        this.name = name;
        this.stno = stno;
    }

    // Method Overriding (clone from Object class)
    @Override
    public Object clone() {

        // Shallow Copy
        try {
            return super.clone();

        } catch (CloneNotSupportedException e) {

            // Exception Handling
            System.out.println("cannot be cloned !!!");
            e.printStackTrace();
            return null;
        }
    }
}

// Main Class
public class Main {

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Object Creation
        // Heap: s1 object | Stack: reference s1
        Student s1 = new Student("baraa", 123);

        // Object Cloning (Shallow Copy)
        Student s2 = (Student) s1.clone();

        // Modifying original object
        s1.name = "xyz";

        // Output (different objects in heap)
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}