package Example_12;

// Class
// Loaded into: Method Area
class Employee {

    // Encapsulation (Private Field)
    // Stored in: Heap (inside object)
    private String name;

    // Constructor
    // Object creation: Stack reference → Heap object
    Employee(String name) {
        this.name = name;
    }

    // Getter Method
    String getName() {
        return name;
    }

    // Method Overriding (equals)
    @Override
    public boolean equals(Object e) {

        // Downcasting
        Employee emp = (Employee) e;

        // Object Comparison
        return emp.getName().equals(getName());
    }
}

// Class
// Loaded into: Method Area
class Point {

    // Instance Variables
    // Stored in: Heap
    private int x;
    private int y;

    // Constructor
    Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    // Method Overriding (equals)
    @Override
    public boolean equals(Object point) {

        // Downcasting
        Point p = (Point) point;

        // Object Comparison
        return p.x == x && p.y == y;
    }
}

// Main Class
public class Main {

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Array of Objects
        // Heap: array object | Stack: reference e
        Employee[] e = new Employee[3];

        // Object Creation
        e[0] = new Employee("Baraa");
        e[1] = new Employee("Ahmad");
        e[2] = new Employee("Hssan");

        // Method Call
        System.out.println(find(e, new Employee("Hssan")));

        // Array of Objects
        Point[] p = new Point[2];

        // Object Creation
        p[0] = new Point(1, 2);
        p[1] = new Point(2, 3);

        // Method Call
        System.out.println(find(p, new Point(1, 9)));
    }

    // Static Method
    static int find(Object[] a, Object key) {

        // Array Traversal
        for (int i = 0; i < a.length; i++) {

            // Method Call (Dynamic Dispatch)
            if (key.equals(a[i])) {

                // Return Statement
                return i;
            }
        }

        // Return Statement
        return -1;
    }
}