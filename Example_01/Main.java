package Example_01;

// Class
class Studant {

    // Encapsulation (Private Fields)
    private String name = "";
    private int ston = 0;
    private double gpa = 0.35;

    // Constructor
    Studant(String n, int s, double g) {

        // Constructor Execution
        System.out.println("object is created");

        name = n;
        ston = s;
        gpa = g;
    }

    // Setter Method
    void setName(String name, int p) {

        // Conditional Statement
        if (p == 1234)

            // this Keyword
            this.name = name;
    }

    // Setter Method
    void setSton(int e) {
        this.ston = e;
    }

    // Setter Method
    void setGPA(double g) {
        gpa = g;
    }

    // Getter Method
    String getName(int p) {

        // Conditional Statement
        if (p == 1234)
            return name;
        else

            // Return Statement
            return "Invalid pin code";
    }

    // Getter Method
    double getGPA() {
        return gpa;
    }
}

// Main Class
public class Main {

    // Main Method
    public static void main(String[] aaaa) {

        // Primitive Variable Declaration
        int x;

        // Reference Variable Declaration
        String y;

        // Reference Declaration
        Studant s1;

        // Object Creation
        s1 = new Studant("Baraa", 123, 2.1);

        // Method Call
        s1.setName("Khamaysa", 1234);

        // Output
        System.out.println(s1.getName(1234));

        // Primitive Array
        int arr[] = new int[10];

        // Array of Objects
        Studant Sarr[] = new Studant[5];

        // Local Variable
        double sum = 0;

        // Array Traversal
        for (int i = 0; i < Sarr.length; i++) {

            Sarr[i] = new Studant("baraa" + i, i + 100, i + 0.5);

            // Arithmetic Operation
            sum += Sarr[i].getGPA();
        }

        System.out.println(sum);
    }
}