package Example_13;

// Single Inheritance
class SalariedEmp extends Employee {

    // Constructor Chaining (super())
    public SalariedEmp(String name, String employeeNumber, double salary) {
        super(name, employeeNumber, salary);
    }

    // Method Overriding
    @Override
    public double calculateSalary() {
        return salary;
    }
}

// Single Inheritance
class PartTimeEmp extends Employee {

    // Private Instance Variables
    // Stored in: Heap (inside object)
    private double hours;
    private double rate;

    // Constructor Chaining (super())
    public PartTimeEmp(String name, String employeeNumber, double hours, double rate) {
        super(name, employeeNumber, hours * rate);
        this.hours = hours;
        this.rate = rate;
    }

    // Method Overriding
    @Override
    public double calculateSalary() {
        return hours * rate;
    }

    // Setter Methods
    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

// Main Class
public class Main {

    // Main Method
    // Stack Frame
    public static void main(String[] args) {

        // Object Creation
        // Stack: department reference
        // Heap: Department object
        Department department = new Department("IT", "20", 5);

        // Method Calls
        SalariedEmp[] fullTimeEmployees = department.getFullTimeEmployees();
        PartTimeEmp[] partTimeEmployees = department.getPartTimeEmployees();

        // Enhanced For Loop
        for (SalariedEmp employee : fullTimeEmployees) {
            System.out.println(employee);
        }

        // Enhanced For Loop
        for (PartTimeEmp employee : partTimeEmployees) {
            System.out.println(employee);
        }

        // Method Calls
        System.out.println("\nTotal Salaries = " + department.getTotalSalaries());
        System.out.println("Part Time Salaries = " + department.getPartTimeSalaries());
        System.out.println("Full Time Salaries = " + department.getFullTimeSalaries());
    }
}