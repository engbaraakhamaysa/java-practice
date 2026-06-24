package Example_04;

// Class
class Employee {

    // Encapsulation (Private Fields)
    private String name;
    private int hours;
    private double raet;

    // Setter Method
    public void SetName(String name) {
        this.name = name;
    }

   
    public void SetHours(int hours) {
        this.hours = hours;
    }

   
    public void SetReat(double raet) {
        this.raet = raet;
    }

    // Getter Method
    public String getName() {
        return name;
    }


    public int getHours() {
        return hours;
    }

  
    public double getRaet() {
        return raet;
    }

    // Business Logic Method
    public double calculaeSalary() {

        // Local Variable
        double salary;

        // Conditional Statement
        if (hours > 40) {

            // Overtime Calculation
            salary = 40 * raet + 1.5 * (hours - 40) * raet;

        } else {

            salary = hours * raet;
        }

        // Return Statement
        return salary;
    }

    // Print Method
    public void print() {

        // Method Call
        System.out.println(
            "The Salary of employee " + getName() +
            " equals " + calculaeSalary()
        );
    }
}

// Main Class
public class Main {

    // Main Method
    public static void main(String[] args) {

        // Object Creation
        Employee e = new Employee();

        // Method Call (Setters)
        e.SetName("Baraa");
        e.SetReat(7.5);
        e.SetHours(42);

        // Method Call
        e.print();
    }
}