package Example_05;
// Class
// Stored in: Method Area (Class Area / MetaSpace)
class Emp {

    // Instance Variables
    // Stored in: Heap (inside each object)
    private String name;
    private double salary;
    private int id;

    // Static Variable
    // Stored in: Static Area (Method Area)
    private static int nextId = 0;

    // Constructor
    // Object creation flow: Stack call → Heap object allocation
    Emp(String name, double salary) {

        this.name = name;
        this.salary = salary;

        // Stored in: Heap (inside object)
        id = nextId;

        // Stored in: Static Area
        nextId++;
    }

    // Getter Methods
    // Code in Method Area, execution uses Stack frame
    int getId() { return id; }
    String getName() { return name; }
    double getSalary() { return salary; }

    // Static Method
    // Stored in: Method Area (no object required)
    static int getNextId() {
        return nextId;
    }
}

// Main Class
// Stored in: Method Area
public class Main {

    // Main Method
    // Stack Frame (main execution context)
    public static void main(String[] args) {

        // Array of References
        // Heap (array object), Stack holds reference
        Emp[] staff = new Emp[3];

        // Object Creation
        // Heap objects, references stored in array
        staff[0] = new Emp("barra", 300);
        staff[1] = new Emp("Ahmad", 200);
        staff[2] = new Emp("Mohamad", 500);

        // Loop Variable
        // Stack
        for (int i = 0; i < staff.length; i++) {

            // Reference Variable
            // Stack → points to Heap object
            Emp e = staff[i];

            // Method Call
            // Stack frame for each call
            System.out.println(
                "name = " + e.getName() +
                " id = " + e.getId() +
                " Salary = " + e.getSalary()
            );

            // Static Method Call
            // Uses Static Area (no object)
            int n = Emp.getNextId();

            System.out.println("Next available id = " + n);
        }
    }
}