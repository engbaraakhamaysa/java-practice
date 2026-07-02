# Java Object-Oriented Programming Practice

## Example 00 - Employee

### Description

Created an Employee class with private attributes and controlled access through methods. An Employee object was created and used in the main method.

### OOP Topics

- **Class:** A blueprint or template that defines the attributes and behaviors of objects.
- **Object:** An instance of a class that represents a real entity with its own state and behavior.
- **Encapsulation:** The concept of bundling data and methods together while restricting direct access to data.
- **Access Modifiers:** Keywords that define the accessibility level of classes, attributes, and methods.
- **this Keyword:** A reference to the current object instance.

---

---

## Example 01 - Student

### Description

Created a Student class with object initialization and controlled data access. Multiple student objects were stored in an array.

### OOP Topics

- **Constructor:** A special method used to initialize objects and assign initial values when an object is created.
- **Getters and Setters:** Methods used to access and modify private attributes while maintaining encapsulation.
- **Object Arrays:** Arrays that store references to multiple objects of the same class.

---

---

## Example 02 - Employee Array

### Description

Created multiple Employee objects, stored them in an array, and passed the array to a method for processing.

### OOP Topics

- **Object References:** Variables that store references to objects in memory instead of storing the object itself.
- **Passing Objects to Methods:** Passing object references as parameters to allow methods to work with objects.

---

---

## Example 03 - Static, Final and Constructor Overloading

### Description

Demonstrated the use of static variables and methods, final variables, constructor overloading, object arrays, and passing objects to methods.

### OOP Topics

- **Static Members:** Class-level variables or methods that belong to the class itself and are shared between all objects.
- **Final Variables:** Variables whose value can be assigned only once and cannot be changed after initialization.
- **Constructor Overloading:** Defining multiple constructors in the same class with different parameter lists.
- **Static Methods:** Methods that belong to the class and can be called without creating an object.
- **Array of Objects:** Creating an array that stores references to multiple objects of the same class.
- **Object Field Access:** Accessing object attributes through an object reference.

---

---

## Example 04 - Encapsulation and Business Logic

### Description

Created an Employee class with private fields, public getters and setters, and a business logic method to calculate an employee's salary based on working hours and overtime.

### OOP Topics

- **Getters and Setters:** Public methods used to access and modify private attributes while preserving encapsulation.
- **Business Logic Methods:** Methods that implement the core rules and calculations of an application.
- **Information Hiding:** Restricting direct access to object data and exposing it only through controlled methods.

---

---

## Example 05 - Static Members for Shared State

### Description

Created employee objects with automatically generated IDs using a static variable shared among all objects. Each new object receives a unique ID, while a static method provides the next available ID.

### OOP Topics

- **Static Variables:** Class-level variables shared by all instances of a class.
- **Static Methods:** Methods that belong to the class rather than individual objects and can access static members directly.
- **Auto-Increment Identifier:** A technique that uses a shared counter to generate unique IDs for objects.
- **Shared Class State:** Data that is common to all objects of a class and maintained through static members.

---

---

## Example 06 - Constructor Chaining

### Description

Created multiple constructors and connected them using `this()` to reuse initialization logic. When an object is created, constructors are executed in a chain.

### OOP Topics

- **Constructor Chaining:** The process of calling one constructor from another constructor within the same class using `this()`.
- **Constructor Reuse:** Reusing existing constructor logic to avoid code duplication.
- **this() Constructor Call:** A special syntax used to invoke another constructor in the same class.

---

---

## Example 07 - Inheritance and Polymorphism

### Description

Created an inheritance hierarchy where `Person` is the base class, while `Student` and `Employee` extend it. Demonstrated multilevel inheritance, method overriding, upcasting, and runtime polymorphism.

### OOP Topics

- **Inheritance:** A mechanism that allows a class to acquire the attributes and methods of another class.
- **Superclass:** The parent class from which other classes inherit.
- **Subclass:** A class that inherits from another class.
- **Multilevel Inheritance:** An inheritance chain where a class inherits from a subclass that already inherits from another class.
- **Hierarchical Inheritance:** Multiple subclasses inheriting from the same superclass.
- **super() Constructor Call:** Used to invoke a constructor of the parent class.
- **Method Overriding:** Providing a new implementation of an inherited method in a subclass.
- **Upcasting:** Storing a subclass object in a superclass reference variable.
- **Runtime Polymorphism:** The ability to execute the overridden method of the actual object at runtime through a parent reference.
- **instanceof Operator:** An operator used to determine whether an object belongs to a specific class or inheritance hierarchy.
- **Downcasting:** Converting a superclass reference back to a subclass reference to access subclass-specific members.
- **Type Casting:** Converting one reference type to another within the same inheritance hierarchy.
- **Runtime Type Checking:** Determining an object's actual type during program execution using the `instanceof` operator.
- **Dynamic Method Dispatch:** The JVM selects the overridden method to execute based on the actual object type at runtime.

---

## Example 08 - Polymorphic Object Arrays

### Description

Created an array of `Vehicle` references to store objects of different subclasses and processed them using polymorphism and the `instanceof` operator.

### New OOP Topics

- **Polymorphic Object Arrays:** Arrays whose element type is a superclass, allowing them to store objects of different subclasses.
- **Heterogeneous Collections:** A collection that stores objects of different related types through inheritance.

---

## Example 09 - Abstract Classes

### Description

Introduced abstract classes and abstract methods to define a common structure for related classes. Concrete subclasses implement the required behavior by overriding abstract methods.

### New OOP Topics

- **Abstract Class:** A class that cannot be instantiated and is designed to be inherited by subclasses.
- **Abstract Method:** A method declared without an implementation that must be implemented by concrete subclasses.
- **Concrete Class:** A non-abstract class that provides implementations for all inherited abstract methods and can be instantiated.
- **Mandatory Method Implementation:** A requirement that concrete subclasses implement all inherited abstract methods.
- **Object Method Overriding (`toString()`):** Overriding the `toString()` method inherited from `Object` to provide a custom string representation of an object.

---

## Example 10 - Interfaces

### Description

Introduced interfaces, interface inheritance, and multiple interface implementation. Demonstrated how a class can extend a superclass while implementing one or more interfaces.

### New OOP Topics

- **Interface:** A contract that defines a set of methods a class must implement.
- **Interface Implementation:** The process of providing implementations for all methods declared in an interface.
- **Multiple Interface Implementation:** A class can implement multiple interfaces simultaneously.
- **Interface Inheritance:** An interface can inherit from another interface using the `extends` keyword.
- **Class and Interface Combination:** A class can extend one superclass while implementing one or more interfaces.
- **Interface Constants:** Variables declared in an interface are implicitly `public`, `static`, and `final`.

---

## Example 11 - Interface Inheritance and Implementation

### Description

Demonstrated interface inheritance by extending one interface from another and implementing the inherited contract in a concrete class.

### New OOP Topics

- **Interface Inheritance:** An interface can inherit the members of another interface using the `extends` keyword.
- **Interface Hierarchy:** A structure where one interface extends another, creating a chain of contracts.
- **Contract Implementation:** A class implementing a derived interface must provide implementations for all inherited abstract methods.

---

## Example 12 - Overriding `equals()`

### Description

Demonstrated how to override the `equals()` method to compare objects based on their content instead of their memory references. A generic search method was used to find different object types by relying on polymorphism.

### New OOP Topics

- **Method Overriding (`equals()`):** Providing a custom implementation of the `equals()` method to define object equality.
- **Object Equality:** Comparing objects based on their state (data) rather than their memory addresses.
- **Dynamic Dispatch:** The JVM invokes the appropriate overridden `equals()` method according to the actual object type at runtime.
- **Generic Object Processing:** Using the `Object` class to write methods that can operate on different object types.

---

## Example 13 - Employee Management System

### Description

Built a simple employee management system using an abstract base class and specialized employee types. Demonstrated polymorphic object management, employee classification, salary calculation, and object filtering within a department.

### New OOP Topics

- **Aggregation:** A "has-a" relationship where one class contains references to objects of another class while they can exist independently.
- **Enhanced For Loop:** A simplified loop used to iterate through arrays or collections.
- **Object Filtering:** Selecting objects of a specific subtype from a polymorphic collection using `instanceof`.
- **Domain Modeling:** Representing real-world entities and their relationships using classes and objects.

## OOP Relationships

| Relationship    | Definition                                                                                                               | Example                                                                                                 |
| --------------- | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------- |
| **Inheritance** | An **"is-a"** relationship where a subclass inherits the properties and methods of a parent class.                       | `class SalariedEmp extends Employee {}`                                                                 |
| **Association** | A **"uses-a"** or **"knows-a"** relationship where one class interacts with another without owning it.                   | A `Manager` manages an `Employee`.                                                                      |
| **Aggregation** | A **"has-a"** relationship with **weak ownership**, where the contained object can exist independently of the container. | A `Department` has multiple `Employee` objects. Employees can still exist if the department is deleted. |
| **Composition** | A **"has-a"** relationship with **strong ownership**, where the contained object's lifecycle depends on the container.   | A `House` has `Room` objects. If the house is destroyed, its rooms are destroyed as well.               |

## OOP Relationships

### 1. Inheritance (is-a)

Represents an **"is-a"** relationship where a class inherits from another class.

```java
class Employee {
    String name;
}

class SalariedEmp extends Employee {
    double salary;
}
```

👉 Meaning: SalariedEmp is a type of Employee.

---

### 2. Association (uses-a / knows-a)

Represents a relationship where one class **uses another class** without owning it.

```java
class Employee {
    String name;
}

class Manager {
    void manage(Employee emp) {
        System.out.println(emp.name);
    }
}
```

👉 Meaning: Manager uses Employee but does not own it.

---

### 3. Aggregation (has-a weak relationship)

Represents a **weak ownership** where an object contains another object, but both can exist independently.

```java
class Employee {
    String name;
}

class Department {
    Employee employee;
}
```

👉 Meaning: Department has Employees, but Employees can exist without Department.

---

### 4. Composition (has-a strong relationship)

Represents a **strong ownership** where the contained object depends on the parent object.

```java
class Room {
    String type;
}

class House {
    Room room = new Room();
}
```

👉 Meaning: House is responsible for creating Room, and Room cannot exist without House.
