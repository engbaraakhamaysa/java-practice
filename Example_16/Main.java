package Example_16;

import java.util.ArrayList;

class Istructor implements Cloneable {

    // Reference variable -> inside Instructor object (Heap)
    // Actual String object -> Heap
    String insName;

    // Primitive value -> stored inside Instructor object (Heap)
    int insNum;

    public Istructor(String insName, int insNum) {

        // Parameter "insName" -> Stack (reference)
        // String object -> Heap
        this.insName = insName;

        // Parameter "insNum" -> Stack (primitive value)
        // Stored inside Instructor object (Heap)
        this.insNum = insNum;
    }

    @Override
    public Object clone() {
        try {

            // "this" reference -> Stack
            // Current Instructor object -> Heap
            // Creates a new Instructor object on the Heap
            System.out.println("Try Instructor");
            return super.clone();

        } catch (CloneNotSupportedException e) {

            // e reference -> Stack
            // Exception object -> Heap
            System.out.println("Catch Instructor");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Instructor {"
                + " insName=" + insName
                + ", insNum=" + insNum
                + " }";
    }
}

class Department implements Cloneable {

    // Reference variable -> inside Department object (Heap)
    // Actual String object -> Heap
    String dName;

    // Primitive value -> stored inside Department object (Heap)
    int dNumber;

    public Department(String dName, int dNumber) {

        // Constructor parameters -> Stack
        this.dName = dName;
        this.dNumber = dNumber;
    }

    @Override
    public String toString() {
        return "Department {"
                + " dName=" + dName
                + ", dNumber=" + dNumber
                + " }";
    }

    @Override
    public Object clone() {
        try {

            // "this" reference -> Stack
            // Current Department object -> Heap
            // Creates a new Department object on the Heap
            return super.clone();

        } catch (CloneNotSupportedException e) {

            // e reference -> Stack
            return null;
        }
    }
}

class Course implements Cloneable {

    // Reference variable -> inside Course object (Heap)
    // Actual String object -> Heap
    String cName;

    // Primitive value -> stored inside Course object (Heap)
    int cNumber;

    // Composition (Strong Has-A Relationship)
    // Reference variable -> inside Course object (Heap)
    // Actual Department object -> Heap
    Department d;

    public Course(String cName, int cNumber, String dName, int dNumber) {

        // Constructor parameters -> Stack
        this.cName = cName;
        this.cNumber = cNumber;

        // Creates a new Department object on the Heap
        // Reference assigned to d
        d = new Department(dName, dNumber);
    }

    @Override
    public String toString() {
        return "Course {"
                + " cName=" + cName
                + ", cNumber=" + cNumber
                + "\n" + d.toString()
                + " }";
    }

    @Override
    public Object clone() {

        // cloned reference -> Stack
        // New Course object -> Heap
        Object cloned;

        try {

            // super.clone() performs a shallow copy
            cloned = super.clone();

            // Creates a new Department object
            // Deep Copy
            ((Course) cloned).d = (Department) d.clone();

            return cloned;

        } catch (CloneNotSupportedException e) {

            // e reference -> Stack
            return null;
        }
    }
}

class Student implements Cloneable {

    // Reference variable -> inside Student object (Heap)
    // Actual String object -> Heap
    String sName;

    // Primitive value -> stored inside Student object (Heap)
    int sNumber;

    // Composition (Strong Has-A Relationship)
    // Reference variable -> inside Student object (Heap)
    // Actual Course object -> Heap
    Course c;

    // Composition (Strong Has-A Relationship)
    // Reference variable -> inside Student object (Heap)
    // Actual Instructor object -> Heap
    Istructor ins;

    public Student(String sName,
                   int sNumber,
                   String cName,
                   int cNumber,
                   String dName,
                   int dNum,
                   String insName,
                   int insNum) {

        // Constructor parameters -> Stack

        this.sName = sName;
        this.sNumber = sNumber;

        // Creates a new Course object on the Heap
        // Reference assigned to c
        c = new Course(cName, cNumber, dName, dNum);

        // Creates a new Instructor object on the Heap
        // Reference assigned to ins
        ins = new Istructor(insName, insNum);
    }

    @Override
    public Object clone() {

        // cloned reference -> Stack
        // New Student object -> Heap
        Object cloned;

        try {

            // super.clone() performs a shallow copy
            cloned = super.clone();

            // Creates a new Course object
            // Deep Copy
            ((Student) cloned).c = (Course) c.clone();

            // Creates a new Instructor object
            // Deep Copy
            ((Student) cloned).ins = (Istructor) ins.clone();

            return cloned;

        } catch (CloneNotSupportedException e) {

            // e reference -> Stack
            System.out.println("Can't be cloned.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student {"
                + " sName=" + sName
                + ", sNumber=" + sNumber
                + "\n" + c.toString()
                + "\n" + ins.toString()
                + " }";
    }
}

public class Main {

    public static void main(String[] args) {

        // s reference -> Stack
        // Student object -> Heap
        Student s = new Student(
                "Baraa",
                123,
                "Java",
                1,
                "IT",
                2,
                "Ala",
                143);

        // String literals -> String Pool (Heap)

        // s1 reference -> Stack
        // Cloned Student object -> Heap
        Student s1 = (Student) s.clone();

        // Updates only the original Student object
        s.sName = "Baraa Khamaysa";
        s.sNumber = 334;

        // Updates only the original Course object
        s.c.cName = "C++";
        s.c.cNumber = 415;

        // Updates only the original Instructor object
        s.ins.insName = "Ahmad";
        s.ins.insNum = 324;

        System.out.println("========== Cloned Object ==========");
        System.out.println(s1);

        System.out.println();

        System.out.println("========== Original Object ==========");
        System.out.println(s);
    }
}

/*
=========================================
Relationships
=========================================

Student -> Course
Composition (Strong Has-A Relationship)

Student -> Instructor
Composition (Strong Has-A Relationship)

Course -> Department
Composition (Strong Has-A Relationship)
*/