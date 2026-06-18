package Example_02;
/*
 * ==========================================================
 * OOP + MEMORY DOCUMENTATION FOR THIS CODE
 * ==========================================================
 */

/*
 * =========================
 * CLASS: Employee
 * =========================
 *
 * Definition:
 * A Class is a blueprint for creating objects.
 *
 * OOP Concept:
 * - Encapsulation (partial, not enforced because fields are public/default)
 * - Object modeling (Employee entity)
 *
 * Memory (Metaspace):
 * - Class definition
 * - Constructor definition
 */
class Employee {

    String name;
    int eno;
    double salary;

    Employee(String name, int eno, double salary) {
        this.name = name;
        this.eno = eno;
        this.salary = salary;
    }
}

/*
 * =========================
 * CLASS: Main
 * =========================
 *
 * Definition:
 * Entry point of the program.
 *
 * OOP Concept:
 * - Contains static behavior (class-level method)
 *
 * Memory (Metaspace):
 * - main method
 * - sum method
 */
public class Main {

    /*
     * =========================
     * METHOD: sum()
     * =========================
     *
     * Definition:
     * A method that processes an array of Employee objects
     * and returns total salary.
     *
     * OOP Concept:
     * - Procedural logic inside OOP structure
     * - Works on objects (Employee)
     *
     * Memory:
     * Stack:
     * - arr (reference)
     * - sum (local variable)
     * - i (loop variable)
     *
     * Heap:
     * - Accesses Employee objects via references
     */
    static double sum(Employee arr[]) {

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]); // prints reference (default toString)

            sum += arr[i].salary; // access object field in Heap
        }

        return sum;
    }

    /*
     * =========================
     * METHOD: main()
     * =========================
     *
     * Definition:
     * Program entry point executed by JVM.
     *
     * Memory:
     * Stack:
     * - n (local variable)
     * - arr (reference to heap array)
     * - i (loop variable)
     *
     * Heap:
     * - Employee[] array object
     * - Employee objects (9 instances)
     *
     * String Pool:
     * - "Baraa"
     */
    public static void main(String[] args) {

        int n = 9;

        /*
         * Array Creation:
         *
         * Stack:
         * - arr reference
         *
         * Heap:
         * - Employee array object (size 9)
         * - initially contains null references
         */
        Employee arr[] = new Employee[n];

        for (int i = 0; i < arr.length; i++) {

            /*
             * Object Creation:
             *
             * Heap:
             * - New Employee object created each iteration
             *
             * String Pool:
             * - "Baraa" reused (not duplicated)
             */
            arr[i] = new Employee("Baraa", 55 + i, 0.32 + i);
        }

        /*
         * Method Call:
         *
         * Stack Frame:
         * - sum(arr)
         *
         * Heap:
         * - reads Employee objects via references
         */
        System.out.println(sum(arr));
    }
}
/*
 * ==========================================================
 * JAVA MEMORY AREAS
 * ==========================================================
 */


/*
 * =========================
 * STACK MEMORY
 * =========================
 * Stores:
 * - Local variables
 * - Method parameters
 * - Primitive local values
 * - Object references
 * - Array references
 * - Method call frames (Stack Frames)
 *
 * Characteristics:
 * - Each thread has its own Stack.
 * - Memory is allocated and released automatically.
 * - Fast access.
 * - LIFO (Last In, First Out).
 */


/*
 * =========================
 * HEAP MEMORY
 * =========================
 * Stores:
 * - Objects
 * - Arrays
 * - Instance variables
 * - Object state/data
 *
 * Characteristics:
 * - Shared between all threads.
 * - Managed by Garbage Collector (GC).
 * - Objects remain alive while reachable.
 * - Larger than Stack memory.
 */


/*
 * =========================
 * METASPACE
 * =========================
 * Stores:
 * - Class metadata
 * - Class definitions
 * - Method definitions
 * - Constructor definitions
 * - Interface metadata
 * - Enum metadata
 * - Annotation metadata
 * - Static fields
 * - Runtime constant pool
 *
 * Characteristics:
 * - Created by JVM.
 * - Shared across all threads.
 * - Replaced the old Method Area / PermGen.
 */


/*
 * =========================
 * STRING POOL
 * =========================
 * Stores:
 * - String literals
 * - Interned String objects
 *
 * Characteristics:
 * - Special memory area for String reuse.
 * - Avoids duplicate String literals.
 * - Improves memory efficiency.
 * - Shared across the JVM.
 */


/*
 * ==========================================================
 * QUICK REFERENCE
 * ==========================================================
 *
 * Local Variables      -> Stack
 * Method Parameters    -> Stack
 * Primitive Values     -> Stack (if local)
 * References           -> Stack
 *
 * Objects              -> Heap
 * Arrays               -> Heap
 * Instance Variables   -> Heap
 *
 * Static Variables     -> Metaspace
 * Class Metadata       -> Metaspace
 * Methods              -> Metaspace
 * Constructors         -> Metaspace
 *
 * String Literals      -> String Pool
 * Interned Strings     -> String Pool
 *
 * ==========================================================
 */

