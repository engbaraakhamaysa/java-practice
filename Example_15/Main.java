package Example_15;

import java.util.ArrayList;

class Course implements Cloneable {

    // Reference variable -> inside Course object (Heap)
    // Actual String object -> Heap
    String name;

    // Primitive value -> stored inside Course object (Heap)
    int cno;

    public Course(String name, int cno) {

        // Parameter "name" -> Stack (reference)
        // String object -> Heap
        this.name = name;

        // Parameter "cno" -> Stack (primitive value)
        // Stored inside this object on the Heap
        this.cno = cno;
    }

    @Override
    public Object clone() {
        try {
            // "this" reference -> Stack
            // Current Course object -> Heap
            return super.clone(); // Creates a new Course object on the Heap
        } catch (CloneNotSupportedException e) {
            // e reference -> Stack
            System.out.println("Cannot be cloned!");
            e.printStackTrace();
            return null;
        }
    }
}

class Student implements Cloneable {

    // Reference variable -> stored inside Student object (Heap)
    // String object -> Heap
    String name;

    // Primitive value -> stored inside Student object (Heap)
    int stno;

    // Reference to a Course object
    // Reference variable -> inside Student object (Heap)
    // Actual Course object -> Heap
   // Composition
    Course c;

    public Student(String name, int stno, String cname, int cno) {

        // Constructor parameters are stored on the Stack

        this.name = name;      // Reference copied into Student object
        this.stno = stno;      // Primitive copied into Student object

        // new Course(...)
        // Creates a Course object on the Heap
        // Reference assigned to c
        this.c = new Course(cname, cno);
    }

    @Override
    public Object clone() {
        try {

            // cloned reference -> Stack
            // New Student object -> Heap
            Student cloned = (Student) super.clone();

            // cloned.c is a reference inside the new Student object
            // c.clone() creates another Course object on the Heap
            cloned.c = (Course) c.clone();

            return cloned;

        } catch (CloneNotSupportedException e) {
            // e reference -> Stack
            System.out.println("Cannot be cloned!");
            e.printStackTrace();
            return null;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // list reference -> Stack
        // ArrayList object -> Heap
        ArrayList<Student> list = new ArrayList<>();

        // S1 reference -> Stack
        // Student object -> Heap
        Student S1 = new Student("Baraa", 123, "Java", 1);

        // String literals ("Baraa", "Java") -> String Pool (inside Heap)

        // S2 reference -> Stack
        // Cloned Student object -> Heap
        Student S2 = (Student) S1.clone();

        // New String literal -> String Pool (Heap)
        // S2.name reference updated
        S2.name = "Baraa Khamaysa";

        // New String literal -> String Pool (Heap)
        // Only cloned Course object is modified
        S2.c.name = "C++";

        // println reference -> Stack
        // Reads values from objects stored on the Heap
        System.out.println("Original Student:");
        System.out.println(S1.name);
        System.out.println(S1.c.name);

        System.out.println();

        System.out.println("Cloned Student:");
        System.out.println(S2.name);
        System.out.println(S2.c.name);
    }
}

// Association
// A general relationship where one class knows or uses another class.
// Aggregation
// A weak Has-A relationship.
// The contained object can exist independently.
// Composition
// A strong Has-A relationship.
// The contained object is created and owned by the parent object.
// Inheritance
// An Is-A relationship.
// One class inherits the properties and methods of another class.
// Dependency
// A temporary Uses-A relationship.
// One class uses another without owning it.
// Realization
// An Implements relationship.
// A class implements the methods of an interface.