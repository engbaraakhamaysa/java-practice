package Example_13;

import java.util.Scanner;

// Class
// Loaded into: Method Area
class Department {

    // Private Instance Variables
    // Stored in: Heap (inside object)
    private String departmentName;
    private String departmentNumber;

    // Array of Object References
    // Heap: array object
    private Employee[] employees;

    // Object Creation
    // Stack: reference input
    // Heap: Scanner object
    Scanner input = new Scanner(System.in);

    // Constructor
    public Department(String departmentName, String departmentNumber, int numberOfEmployees) {

        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;

        // Array of Objects
        employees = new Employee[numberOfEmployees];

        // Array Traversal
        for (int i = 0; i < employees.length; i++) {

            // Output
            System.out.println("\nChoose employee type:");
            System.out.println("1- Part Time");
            System.out.println("2- Full Time");

            // User Input
            int choice = input.nextInt();

            String name = input.next();
            String employeeNumber = input.next();

            // Conditional Statement
            if (choice == 1) {

                double hours = input.nextDouble();
                double rate = input.nextDouble();

                // Upcasting
                employees[i] = new PartTimeEmp(name, employeeNumber, hours, rate);

            } else if (choice == 2) {

                double salary = input.nextDouble();

                // Upcasting
                employees[i] = new SalariedEmp(name, employeeNumber, salary);

            } else {

                System.out.println("Wrong Choice");

                // Loop Control
                i--;
            }
        }
    }

    // Business Logic Method
    public double getTotalSalaries() {

        // Local Variable
        double sum = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // Runtime Polymorphism
            sum += employee.calculateSalary();
        }

        // Return Statement
        return sum;
    }

    // Business Logic Method
    public double getPartTimeSalaries() {

        double sum = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // instanceof Operator
            if (employee instanceof PartTimeEmp) {

                // Runtime Polymorphism
                sum += employee.calculateSalary();
            }
        }

        return sum;
    }

    // Business Logic Method
    public double getFullTimeSalaries() {

        double sum = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // instanceof Operator
            if (employee instanceof SalariedEmp) {

                // Runtime Polymorphism
                sum += employee.calculateSalary();
            }
        }

        return sum;
    }

    // Business Logic Method
    public PartTimeEmp[] getPartTimeEmployees() {

        int count = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // instanceof Operator
            if (employee instanceof PartTimeEmp) {
                count++;
            }
        }

        // Array of Objects
        PartTimeEmp[] partTimeEmployees = new PartTimeEmp[count];

        int index = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // Downcasting
            if (employee instanceof PartTimeEmp) {
                partTimeEmployees[index++] = (PartTimeEmp) employee;
            }
        }

        // Return Statement
        return partTimeEmployees;
    }

    // Business Logic Method
    public SalariedEmp[] getFullTimeEmployees() {

        int count = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // instanceof Operator
            if (employee instanceof SalariedEmp) {
                count++;
            }
        }

        // Array of Objects
        SalariedEmp[] fullTimeEmployees = new SalariedEmp[count];

        int index = 0;

        // Enhanced For Loop
        for (Employee employee : employees) {

            // Downcasting
            if (employee instanceof SalariedEmp) {
                fullTimeEmployees[index++] = (SalariedEmp) employee;
            }
        }

        // Return Statement
        return fullTimeEmployees;
    }
}