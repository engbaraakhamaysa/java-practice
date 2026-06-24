package Example_00;

// Class
class Employee {

    // Encapsulation (Private Fields)
    private String name;
    private double salary;
    private int eno;

    // Setter Method
    void setName(String name, int pass) {

        // Conditional Statement
        if (pass == 1257)

            // this Keyword
            this.name = name;
    }

    // Setter Method
    void setEno(int eno, int pass) {

        // Conditional Statement
        if (pass == 1234)

            // this Keyword
            this.eno = eno;
    }
}

// Main Class
public class Main {

    // Main Method
    public static void main(String[] args) {

        // Object Creation
        Employee e1 = new Employee();

        // Method Call
        e1.setName("baraa", 1257);

        // Method Call
        e1.setEno(12, 1234);

        // Primitive Variable Declaration
        int x;

        // Reference Variable Declaration
        String y;

        // Loop (for)
        for (int i = 0; i < 10; i++) {

            // Output
            System.out.println("Hi theree" + i + i);

            // Arithmetic Operation
            System.out.println(i + i);
        }
    }
}