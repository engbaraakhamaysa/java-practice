
package Example_17;

// Import FileInputStream class.
// Class metadata -> Method Area
import java.io.FileInputStream;

// Import ArrayList class.
// Class metadata -> Method Area
import java.util.ArrayList;

// Student class.
class Student {

    // Reference variable -> inside Student object (Heap)
    // Actual String object -> Heap (String Pool)
    String name;

    // Primitive value -> stored inside Student object (Heap)
    int stno;

    public Student(String name, int stno) {

        // Constructor parameters -> Stack

        // Reference copied into Student object (Heap)
        this.name = name;

        // Primitive value copied into Student object (Heap)
        this.stno = stno;
    }

    // Method call frame -> Stack
    void xyz() {

    }

    @Override
    public String toString() {

        // Creates a new String object for the result.
        // Returned reference -> Stack
        return name + " " + stno;
    }
}

public class Main {

    public static void main(String[] args) {

        // Reference variable -> Stack
        // FileInputStream object -> Heap
        FileInputStream r;

        try {

            // Creates FileInputStream object on the Heap.
            // Reference stored in r (Stack)
            r = new FileInputStream("/home/baraa/Projects/java-practice/Example_17/text");

            // Primitive value -> Stack
            int x;

            // Reads one byte at a time until end of file (-1).
            for (; (x = r.read()) != -1;) {

                // x is converted to char then printed.
                System.out.print((char) x);
            }

        } catch (Exception e) {

            // e reference -> Stack
            // Exception object -> Heap
            e.printStackTrace();
        }

        // Reference variable -> Stack
        // ArrayList object -> Heap
        ArrayList<Student> list = new ArrayList<Student>();

        // Creates Student object -> Heap
        // Reference stored inside ArrayList object.
        list.add(new Student("baraa", 1));

        // Creates Student object -> Heap
        list.add(new Student("baraa", 2));

        // Creates Student object -> Heap
        list.add(new Student("baraa", 3));

        // Reference variable -> Stack
        // ArrayList object -> Heap
        ArrayList<String> list2 = new ArrayList<String>();

        // String literals -> String Pool (Heap)
        // References stored inside ArrayList.
        list2.add("Issa");
        list2.add("baraa");
        list2.add("Ahmad");
        list2.add("Issa");
        list2.add("Issa");

        // contains() compares references/equals().
        // Returns primitive boolean -> Stack.
        System.out.println(list.contains("Issa"));

        // Finds the last occurrence of "Issa".
        // Returned int -> Stack.
        System.out.println("indexof issa: " + list2.lastIndexOf("Issa"));

        // Returns last index again.
        System.out.println(list2.lastIndexOf("Issa"));

        // Removes the first occurrence of "Issa".
        // Object becomes eligible for Garbage Collection
        // if no references point to it.
        list2.remove("Issa");

        // Replaces element at index 1.
        // Only the reference inside ArrayList changes.
        list2.set(1, "Massood");

        // Creates Student object -> Heap.
        // Inserts its reference into ArrayList.
        list.add(1, new Student("Ali", 4));

        // Prints ArrayList contents.
        System.out.println(list2);

        // i -> primitive value stored on Stack.
        for (int i = 0; i < list.size(); i++) {

            // get(i) returns a reference to Student object.
            // Reference -> Stack
            // Student object -> Heap
            System.out.println(list.get(i));
        }
    }
}

/*
 * =========================================
 * Memory Summary
 * =========================================
 * 
 * Stack
 * -----
 * - main() local variables
 * - r
 * - x
 * - list
 * - list2
 * - i
 * - Method parameters
 * - Exception reference (e)
 * 
 * Heap
 * ----
 * - FileInputStream object
 * - ArrayList<Student> object
 * - ArrayList<String> object
 * - Student objects
 * - String objects
 * - Exception object
 * 
 * String Pool (inside Heap)
 * -------------------------
 * "baraa"
 * "Issa"
 * "Ahmad"
 * "Massood"
 * "Ali"
 * 
 * Rule
 * ----
 * Primitive variables (int, char, boolean...) inside methods
 * -> Stack
 * 
 * Reference variables
 * -> Stack
 * 
 * Every object created using new
 * -> Heap
 * 
 * Objects stored inside ArrayList
 * -> Heap
 * Only their references are stored inside the ArrayList object.
 */
