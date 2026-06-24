package Example_03;

// Class
class Test {

}

class Employee {

    // Static Variable
    static int c;

    // Instance Variables
    String name;
    double salary = 5;
    int eno;

    // Blank Final Variable
    final int j;

    // Final Variable
    final int f = 6;

    // Static Method
    static void foo() {

        // Object Creation
        Employee e = new Employee("sss", 2.4, 123);
    }

    // Constructor
    Employee(String name, double salary, int eno) {

        // Constructor Execution
        System.out.println("inside canst");

        // this Keyword
        this.name = name;
        this.salary = salary;

        // Final Initialization
        j = eno;
    }

    // Constructor Overloading
    Employee(double salary, String name, int eno) {

        System.out.println("inside canst 2");

        j = 4;
    }
}

// Main Class
public class Main {

    // Main Method
    public static void main(String[] args) {

        // Reference Declaration
        Employee e;

        e = new Employee("Baraa", 2002.1, 123);

        Employee e2 = new Employee(200.21, "Baraa", 123);

        Test t = new Test();

        // Primitive Variable
        int n = 4;

        // Primitive Array
        int x[] = new int[n];

        // Array of Objects
        Employee arr[] = new Employee[5];

        // Array Traversal
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 3;
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new Employee("xyz", i + 3000, i + 10);

            // Static Variable Access
            arr[0].c = 400;
            arr[i].c = 1000;
            Employee.c = 555;

            // Output
            System.out.println(arr[0].c);

            // Method Call
            System.out.println(getSalaires(arr));
        }
    }

    static double getSalaires(Employee emps[]) {

        // Local Variable
        double sum = 0;

        for (int i = 0; i < emps.length; i++) {

            // Object Field Access
            sum += emps[i].salary;
        }

        // Return Statement
        return sum;
    }
}