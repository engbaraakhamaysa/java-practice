package Example_10;

// Interface
// Loaded into: Method Area
interface Test {

    // Interface Constant
    // Stored in: Static Area (public static final)
    int x = 9;

    // Abstract Method
    // Implicitly public abstract
    void print();
}

// Interface
// Loaded into: Method Area
interface Test2 {

    // Abstract Method
    void xyz();
}

// Class
// Loaded into: Method Area
class Parent {
}

// Interface Inheritance
interface Test3 extends Test2 {

}

// Class Inheritance + Interface Implementation
class Child extends Parent implements Test, Test2 {

    // Method Implementation
    @Override
    public void print() {
    }

    // Method Implementation
    @Override
    public void xyz() {
    }
}

// Main Class
public class Main {

}