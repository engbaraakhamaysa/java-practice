package Example_13;

// Abstract Class
// Loaded into: Method Area
public abstract class Employee {

    // Protected Instance Variables
    // Stored in: Heap (inside object)
    protected String name;
    protected String employeeNumber;
    protected double salary;

    // Constructor
    // Object creation: Stack reference → Heap object
    public Employee(String name, String employeeNumber, double salary) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }

    // Abstract Method
    // Must be implemented by subclasses
    public abstract double calculateSalary();

    // Method Overriding (Object.toString())
    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", salary=" + calculateSalary() +
                '}';
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}