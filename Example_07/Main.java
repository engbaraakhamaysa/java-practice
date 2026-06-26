package Example_07;
// Base Class (Superclass)
// Stored in: Method Area
class Person {

    // Instance Variables
    // Stored in: Heap (inside object)
    String name;
    int ssn;

    // Constructor
    // Object creation: Stack reference → Heap object
    public Person(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

// Single Inheritance
class Student extends Person {

    // Instance Variable
    // Stored in: Heap
    double GPA;

    // Constructor Chaining (super())
    public Student(double GPA, String name, int ssn) {
        super(name, ssn);
        this.GPA = GPA;
    }

    // Instance Method
    // Code: Method Area | Execution: Stack
    void calculateGPA() {
        System.out.println("Inside Student");
    }
}

// Multilevel Inheritance
class BSC extends Student {

    // Instance Variable
    // Stored in: Heap
    int x;

    // Constructor Chaining (super())
    public BSC(double GPA, String name, int ssn) {
        super(GPA, name, ssn);
    }

    // Method Overriding
    @Override
    void calculateGPA() {
        System.out.println("Inside BSC");
    }
}

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

class Phd extends Student {

    // Instance Variable
    // Stored in: Heap
    String col;

    public Phd(double GPA, String name, int ssn) {
        super(GPA, name, ssn);
    }

    // Method Overriding
    @Override
    void calculateGPA() {
        System.out.println("Inside Phd");
    }
}

// Hierarchical Inheritance
class Employee extends Person {

    // Instance Variable
    // Stored in: Heap
    double salary;

    public Employee(double salary, String name, int ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Inside employee");
    }
}

class PartTime extends Employee {

    public PartTime(int hours, double rate, double salary, String name, int ssn) {
        super(salary, name, ssn);
    }

    // Method Overriding
    void calculateSalary() {
        System.out.println("Inside part time");
    }
}

class FullTime extends Employee {

    public FullTime(double salary, String name, int ssn) {
        super(salary, name, ssn);
    }

    // Method Overriding
    void calculateSalary() {
        System.out.println("inside full time");
    }
}

// Main Class
public class Main {

    // Static Method
    // Code: Method Area | Execution: Stack
    static void general(Person p) {

        // instanceof
        if (p instanceof Student) {

            // Downcasting
            ((Student) p).calculateGPA();

        } else if (p instanceof Employee) {

            // Downcasting
            ((Employee) p).calculateSalary();
        }
    }

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Upcasting
        // Stack: Student reference
        // Heap: Phd object
        Student s = new Phd(3.1, "Baraa", 123);

        // Upcasting
        // Stack: Employee reference
        // Heap: FullTime object
        Employee e = new FullTime(1253, "Ahmad", 123);

        // Downcasting
        // Stack reference → Heap object
        ((Phd) s).col = "Science";

        // Upcasting
        s = new BSC(2.4, "Baraa", 123);

        // Method Call
        general(s);
        general(e);

        // Primitive Casting
        double x = 3.4;

        // Explicit Casting
        int y = (int) x;

        System.out.println(y);

    }
}