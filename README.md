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
