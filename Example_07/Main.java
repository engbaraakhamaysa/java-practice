package Example_07;

// Base Class (Superclass)
// Stored in: Method Area
class Person {

    // Instance Variables
    // Stored in: Heap (inside object)
    String name;
    int ssn;

    // Constructor
    public Person(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

// Inheritance
// Student IS-A Person
class Student extends Person {

    // Instance Variable
    // Stored in: Heap
    double GPA;

    // Constructor
    // Constructor Chaining using super()
    public Student(double GPA, String name, int ssn) {
        super(name, ssn);
        this.GPA = GPA;
    }

    // Method
    
    void calculateGPA() {
        System.out.println("Inside Student");
    }
}

// Multilevel Inheritance
// BSC IS-A Student
class BSC extends Student {

    int x;

    public BSC(double GPA, String name, int ssn) {
        super(GPA, name, ssn);
    }

    // Method Overriding
    @Override
    void calculateGPA() {
        System.out.println("Inside BSC");
    }
}

// Multilevel Inheritance
// MSC IS-A Student
class MSC extends Student {

    int x;

    public MSC(double GPA, String name, int ssn) {
        super(GPA, name, ssn);
    }

    // Method Overriding
    @Override
    void calculateGPA() {
        System.out.println("Inside MSC");
    }
}

// Hierarchical Inheritance
// Employee IS-A Person
class Employee extends Person {

    double salary;

    public Employee(double salary, String name, int ssn) {
        super(name, ssn);
        this.salary = salary;
    }
      
    void calculateSalary() {
        System.out.println("Inside employee");
    }
}

// Main Class
public class Main {

    // Static Method
    static boolean test(Person s) {

        // instanceof Operator
        return s instanceof Student;
    }

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Upcasting
        // Stack: s (Student reference)
        // Heap: BSC object
        Student s = new BSC(2.1, "Baraa", 123);

        // Method Call
        System.out.println(test(s));

        // Upcasting
        // Stack: s (Student reference)
        // Heap: MSC object
        s = new MSC(2.4, "Mahmaud", 1123);

        // Method Call
        System.out.println(test(s));
    }
}

// Valid: Student reference can hold any subclass object
// Student s = new BSC(...);
// s = new MSC(...);

// Invalid: BSC reference cannot hold a sibling class object
// BSC b = new BSC(...);
// b = new MSC(...); // Compile-time error

/*
A Student reference can point to any object of Student or its subclasses (e.g., BSC, MSC).
A BSC reference can only point to BSC objects, not sibling classes like MSC.
*/