package Example_07;

class Person {
    String name;
    int ssn;

    public Person(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}


class Student extends Person {
    double GPA;

    public Student(double GPA, String name, int ssn) {
        super(name, ssn);
        this.GPA = GPA;
    }

    void calculateGPA() {
        System.out.println("Inside Student");

    }
}


class BSC extends Student {
    int x;

    public BSC(double GPA, String name, int ssn) {
        super(GPA, name, ssn);

    }

    void calculateGPA() {
        System.out.println("Inside BSC");

    }
}


    
class MSC extends Student {
    int x;

    public MSC(double GPA, String name, int ssn) {
        super(GPA, name, ssn);

    }

    void calculateGPA() {
        System.out.println("Inside MSC");

    }
}
    
    class Employee extends Person {
        double salary;

public Employee(double salary, String name, int ssn) {
    super(name, ssn);
            this.salary = salary;
        }
        
        void calculateSalary() {
            System.out.println("Inside employee");
        }
    }

    public class Main {
    
static boolean test(Person s) {
    return s instanceof Student;
}

        public static void main(String[] args) {
        
            Student s = new BSC(2.1, "Baraa", 123);
          System.out.println(  test(s));
            s = new MSC(2.4, "Mahmaud", 1123);
           System.out.println( test(s));
            

    } 
    
}
