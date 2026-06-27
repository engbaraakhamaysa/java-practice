package Example_09;

// Abstract Class (Superclass)
// Loaded into: Method Area
abstract class Person {

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

    // Abstract Method
    // Declared only (implemented by subclasses)
    abstract void calculateAge();
}

// Abstract Class
// Single Inheritance
abstract class Student extends Person {

    // Instance Variable
    // Stored in: Heap
    double gpa;

    // Constructor Chaining (super())
    public Student(double gpa, String name, int ssn) {
        super(name, ssn);
        this.gpa = gpa;
    }

    // Abstract Method
    abstract void calculateGpa();
}

// Multilevel Inheritance
class Bsc extends Student {

    int x;

    public Bsc(double gpa, String name, int ssn) {
        super(gpa, name, ssn);
    }

    // Method Overriding
    void calculateAge() {}

    // Instance Method
    void xyz() {}

    // Method Overriding
    void calculateGpa() {
        System.out.println("inside Bsc");
    }
}

// Multilevel Inheritance
class Phd extends Student {

    // Instance Variable
    // Stored in: Heap
    String col;

    public Phd(String col, double gpa, String name, int ssn) {
        super(gpa, name, ssn);
        this.col = col;
    }

    // Method Overriding
    void calculateAge() {}

    // Method Overriding
    void calculateGpa() {
        System.err.println("inside Phd");
    }
}

// Multilevel Inheritance
class Msc extends Student {

    public Msc(double gpa, String name, int ssn) {
        super(gpa, name, ssn);
    }

    // Method Overriding
    void calculateAge() {}

    // Method Overriding
    void calculateGpa() {
        System.err.println("inside Msc");
    }
}

// Abstract Class
// Hierarchical Inheritance
abstract class Employee extends Person {

    // Instance Variable
    // Stored in: Heap
    double salary;

    public Employee(double salary, String name, int ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    // Instance Method
    void calculateSalary() {
        System.out.println("inside employee");
    }
}

class PartTime extends Employee {

    public PartTime(int hrs, double rate, double salary, String name, int ssn) {
        super(rate * hrs, name, ssn);
    }

    // Method Overriding
    void calculateAge() {}

    // Method Overriding
    void calculateSalary() {
        System.err.println("Inside part time");
    }
}

class FullTime extends Employee {

    public FullTime(double salary, String name, int ssn) {
        super(salary, name, ssn);
    }

    // Method Overriding
    void calculateAge() {}

    // Method Overriding (Object.toString())
    public String toString() {
        return "Name:" + name + "\nSSN:" + ssn + "\nSalary:" + salary;
    }

    // Method Overriding
    void calculateSalary() {
        System.err.println("inside full time");
    }
}

// Main Class
public class Main {

    // Static Method
    static void general(Person p) {

        // instanceof Operator
        if (p instanceof Student) {

            // Downcasting
            ((Student) p).calculateGpa();

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
        Student s = new Phd("cs", 1.0, "Baraa", 123);

        // Upcasting
        // Stack: Employee reference
        // Heap: FullTime object
        Employee e = new FullTime(1257, "Ahmad", 123);

        // Output (calls toString())
        System.out.println(e);

        // Downcasting
        ((Phd) s).gpa = 3;

        // Downcasting
        Phd s3 = (Phd) s;

        // Upcasting
        s = new Bsc(3.4, "Ahmad", 124);

        // Method Call
        general(s);
        general(e);

        // Primitive Casting
        double x = 3.4;

        // Explicit Casting
        int y = (int) x;

        // Output
        System.out.println(y);
    }
}