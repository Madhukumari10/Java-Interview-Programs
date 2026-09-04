# OOPs Notes

## 1. What is OOPs?

OOPs stands for **Object-Oriented Programming System**.

It is a programming approach where a program is designed using **objects and classes**.

Java is an **Object-Oriented Programming Language**.

### Main Principles of OOPs

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## 2. Class

A class is a **blueprint or template** used to create objects.

It defines the properties and behaviors of an object.

### Example

```java
class Student {

    int id;
    String name;

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

```
## Here:

* Student is a class.
* id and name are variables/data members.
* display() is a method.

---

## 3.  Object

An object is an instance of a class.

An object is created using the new keyword.

Example:
```java
class Student {

    int id;
    String name;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Madhu";

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

```

## Here:
* Student is the class.
* s1 is the reference variable.
* new Student() creates the object.

---

## 4.new Keyword

The new keyword is used to create an object in Java.

Example:
```java
Student s1 = new Student();

```

## Here:
* Student → class type
* s1 → reference variable
* new → creates object
* Student() → constructor call


---

## 5. Four Pillars of OOPs

The four major pillars of OOPs are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## 6. Encapsulation

Encapsulation means wrapping data and methods into a single unit.

In Java, encapsulation is generally achieved by:

* Making variables private
* Providing public getter and setter methods

Example:
```java
class Employee {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setId(101);
        e.setName("Madhu");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
```
---
## Advantages of Encapsulation
* Data hiding
* Security
* Better control over data
* Easy maintenance
* Loose coupling

---

## 7. Inheritance

Inheritance is a mechanism where one class acquires the properties and behaviors of another class.

The extends keyword is used for class inheritance.

Example:
```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}
```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}

```
## Here:
* Animal → Parent/Superclass
* Dog → Child/Subclass
* Dog inherits eat() from Animal

---

## 8.Types of Inheritance

Java supports:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java does not support multiple inheritance through classes.

Multiple inheritance can be achieved using interfaces.

---

## 8.1 Single Inheritance

One child class inherits from one parent class.

```java
class A {

    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {

    void showB() {
        System.out.println("Class B");
    }
}
```
Relationship:
```java
A
|
B
```
## 8.2 Multilevel Inheritance

A class inherits from another child class.
```java
class A {

    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {

    void showB() {
        System.out.println("Class B");
    }
}

class C extends B {

    void showC() {
        System.out.println("Class C");
    }
}
```
Relationship:
```java
A
|
B
|
C
```
## 8.3 Hierarchical Inheritance

Multiple child classes inherit from the same parent class.
```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meowing");
    }
}
```
Relationship:
```java
       Animal
       /    \
     Dog    Cat
```
## 9. Multiple Inheritance

Multiple inheritance means one class inherits from multiple parent classes.

Java does not support multiple inheritance through classes.

Not Allowed
```java
class A {
}

class B {
}

class C extends A, B {
}
```
This produces a compilation error.

Why?

It can create ambiguity when both parent classes contain methods with the same name.

Java solves this problem using interfaces.

---

## 10.Polymorphism

Polymorphism means one name, many forms.

Polymorphism allows the same method name to behave differently in different situations.

There are two types:

1. Compile-Time Polymorphism
2. Runtime Polymorphism

---

## 11. Compile-Time Polymorphism

Compile-time polymorphism is achieved using method overloading.


## 11.1 Method Overloading

Method overloading means having multiple methods with:

* Same method name
* Different parameter list

The parameters can differ in:

* Number
* Type
* Order
  
Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
    }
}
```
Important

Changing only the return type does not create method overloading.

Invalid:
```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

## 12. Runtime Polymorphism

Runtime polymorphism is achieved using method overriding.

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

Example:
```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```
Output
```java
Dog barks
```
Here the method that executes is decided at runtime.

---

## 13. Method Overloading vs Method Overriding
| Method Overloading                | Method Overriding                     |
| --------------------------------- | ------------------------------------- |
| Compile-time polymorphism         | Runtime polymorphism                  |
| Same class usually                | Parent-child relationship             |
| Same method name                  | Same method signature                 |
| Parameters must be different      | Parameters must be same               |
| Return type alone cannot overload | Return type must be same or covariant |
| Inheritance is not required       | Inheritance is required               |
---
## 14. Abstraction

Abstraction means hiding implementation details and showing only essential information.

Java provides abstraction using:

1. Abstract classes
2. Interfaces

---
## 15. Abstract Class

A class declared with the abstract keyword is called an abstract class.

An abstract class can contain:

* Abstract methods
* Concrete methods
* Variables
* Constructors
* Static methods
* Final methods

Example:
```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}
```
A child class provides implementation of the abstract method.
```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
```

## 16.Abstract Method

An abstract method is a method without a body.

Example:
```java
abstract class Animal {

    abstract void sound();
}
```
The child class must implement the abstract method unless the child class is also abstract.

---
## 17. Interface

An interface is used to achieve abstraction and multiple inheritance in Java.

The interface keyword is used to create an interface.

Example:
```java
interface Vehicle {

    void start();
}
```
A class implements an interface using the implements keyword.
```java
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }
}
```
Usage
```java
public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}
```

## 18. Multiple Inheritance Using Interface

Java supports multiple inheritance through interfaces.

Example
```java
interface A {

    void showA();
}

interface B {

    void showB();
}

class C implements A, B {

    @Override
    public void showA() {
        System.out.println("A");
    }

    @Override
    public void showB() {
        System.out.println("B");
    }
}
```
Here class C implements both interfaces.

---

## 19. Encapsulation vs Abstraction
| Encapsulation                                        | Abstraction                                    |
| ---------------------------------------------------- | ---------------------------------------------- |
| Hides data                                           | Hides implementation                           |
| Achieved using private variables and getters/setters | Achieved using abstract classes and interfaces |
| Focuses on data security                             | Focuses on essential functionality             |
| Answers "How to protect data?"                       | Answers "What should be exposed?"              |
---

## 20. Constructor

A constructor is a special member of a class used to initialize objects.

Rules of Constructor
* Constructor name must be same as class name.
* It has no return type.
* It is called automatically when an object is created.
* Constructors can be overloaded.
* Constructors are not inherited.

Example
```java
class Student {

    int id;
    String name;

    Student() {
        System.out.println("Constructor called");
    }
}
```

## 21. Default Constructor

A constructor with no parameters is called a no-argument constructor.
```java
class Student {

    Student() {
        System.out.println("Student object created");
    }
}
```

## 22. Parameterized Constructor

A constructor that accepts parameters is called a parameterized constructor.
```java
class Student {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
```

## 23. Constructor Overloading

A class can have multiple constructors with different parameter lists.
```java
class Student {

    int id;
    String name;

    Student() {
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
```

## 24. this Keyword

The this keyword refers to the current object.

Example
```java
class Student {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}
```
Here:

* this.id → instance variable
* id → constructor parameter
---

## 25. Uses of this Keyword

The this keyword can be used to:

1. Refer to current class instance variable.
2. Invoke current class method.
3. Invoke current class constructor.
4. Pass current object as an argument.
5. Return current object.
   
Example
```java
class Student {

    void show() {
        System.out.println("Hello");
    }

    void display() {

        this.show();
    }
}
```

## 26. super Keyword

The super keyword refers to the immediate parent class object.

It can be used to:

1. Access parent class variable.
2. Call parent class method.
3. Call parent class constructor.

Example
```java
class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void show() {

        System.out.println(super.x);
    }
}
```
Output:
10

---
## 27. Access Modifiers

Java provides four access levels:

1. private
2. default
3. protected
4. public

| Modifier  | Same Class | Same Package | Subclass Other Package | Other Package |
| --------- | ---------- | ------------ | ---------------------- | ------------- |
| private   | Yes        | No           | No                     | No            |
| default   | Yes        | Yes          | No                     | No            |
| protected | Yes        | Yes          | Yes                    | No            |
| public    | Yes        | Yes          | Yes                    | Yes           |
---

## 28. static Keyword

The static keyword belongs to the class rather than to an individual object.

It can be used with:

* Variables
* Methods
* Blocks
* Nested classes

Static Variable
```java
class Student {

    int id;
    static String college = "ABC College";
}
```
The static variable is shared by all objects.

---

## 29. Static Method

A static method belongs to the class.
```java
class Test {

    static void display() {

        System.out.println("Hello");
    }
}
```
It can be called using the class name.
```java
Test.display();
```

## 30.Static vs Non-Static
| Static                             | Non-Static                             |
| ---------------------------------- | -------------------------------------- |
| Belongs to class                   | Belongs to object                      |
| Can be accessed using class name   | Usually accessed using object          |
| One shared copy                    | Separate copy for each object          |
| Can directly access static members | Can access static and instance members |
---

## 31. Association

Association represents a relationship between two independent objects.

Example:
```
Teacher ---- Student
```
A teacher and student can exist independently.


## 32. Aggregation

Aggregation is a weak HAS-A relationship.

The child object can exist independently of the parent.

Example:
```java
class Department {
}

class University {

    Department department;
}
```
A department can exist independently of a university.

---

## 33. Composition

Composition is a strong HAS-A relationship.

The child object generally depends on the parent object's lifecycle.

Example:
```java
class Engine {
}

class Car {

    private Engine engine = new Engine();
}
```
Here Car has an Engine.

---

## 34. IS-A Relationship

IS-A relationship represents inheritance.

Example:
```
Dog IS-A Animal
```
Java:
```java
class Animal {
}

class Dog extends Animal {
}
```

## 35. HAS-A Relationship

HAS-A relationship represents composition or aggregation.

Example:
```
Car HAS-A Engine
```
Java:
```java
class Engine {
}

class Car {

    Engine engine;
}
```

## 36. Object Class

Object is the root class of the Java class hierarchy.

Every Java class directly or indirectly inherits from Object.

Common methods of Object class:

* toString()
* equals()
* hashCode()
* getClass()
* clone()
* wait()
* notify()
* notifyAll()
---

## 37.toString()

The toString() method returns a string representation of an object.

Example:
```java
class Student {

    int id;
    String name;

    @Override
    public String toString() {

        return id + " " + name;
    }
}
```

## 38. equals()

The equals() method is used to compare objects logically.

Example:
```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1.equals(s2));
```
Output:
true

---
## 39. hashCode()

hashCode() returns an integer hash value for an object.

It is commonly used in hash-based collections such as:

* HashMap
* HashSet
* Hashtable

Important Rule

If two objects are equal according to equals(), they must have the same hashCode().
---

## 40. Final Keyword

The final keyword can be used with:

* Variable
* Method
* Class

Final Variable

A final variable cannot be reassigned.
```java
final int x = 10;
```
Final Method

A final method cannot be overridden.
```java
class Parent {

    final void show() {
        System.out.println("Parent");
    }
}
```
Final Class

A final class cannot be inherited.
```java
final class Parent {
}
```

## 41. Method Overloading Rules

Method overloading requires:

Same method name
Different parameter list

Example:
```java
void show(int x) {
}

void show(String x) {
}

void show(int x, int y) {
}
```

## 42. Method Overriding Rules

For method overriding:

* Parent-child relationship is required.
* Method name must be same.
* Parameters must be same.
* Return type must be same or covariant.
* Access level cannot be more restrictive.
* final methods cannot be overridden.
* static methods are hidden, not overridden.
* Private methods cannot be overridden.

---

## 43. Upcasting

Upcasting means storing a child object in a parent class reference.
```java
Animal a = new Dog();
```
This is safe and commonly used in runtime polymorphism.

---

## 44. Downcasting

Downcasting means converting a parent reference back to a child reference.
```java
Animal a = new Dog();

Dog d = (Dog) a;
```
Downcasting should be done carefully.

---

## 45. instanceof Operator

The instanceof operator checks whether an object belongs to a particular type.

Example:
```java
Animal a = new Dog();

if (a instanceof Dog) {

    System.out.println("Object is Dog");
}
```

## 46. Dynamic Method Dispatch

Dynamic Method Dispatch is the mechanism by which an overridden method is resolved at runtime.

Example:
```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog bark");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}
```
Output:
Dog bark

---

## 47. Association vs Aggregation vs Composition
| Relationship | Meaning              | Dependency                    |
| ------------ | -------------------- | ----------------------------- |
| Association  | General relationship | Independent                   |
| Aggregation  | Weak HAS-A           | Child can exist independently |
| Composition  | Strong HAS-A         | Child depends on parent       |
---

## 48. Class vs Object
| Class                                  | Object                         |
| -------------------------------------- | ------------------------------ |
| Blueprint                              | Instance of class              |
| Logical entity                         | Physical/runtime entity        |
| Does not represent a specific instance | Represents a specific instance |
| Created using class definition         | Created using `new`            |
---

## 49. Abstract Class vs Interface
| Abstract Class                         | Interface                                     |
| -------------------------------------- | --------------------------------------------- |
| Declared using `abstract class`        | Declared using `interface`                    |
| Can have constructors                  | Cannot have constructors                      |
| Can have instance variables            | Variables are public static final by default  |
| Can have abstract and concrete methods | Can have abstract, default and static methods |
| Class extends abstract class           | Class implements interface                    |
| A class can extend only one class      | A class can implement multiple interfaces     |
---

## 50. Important OOPs Interview Questions
Q1. What is OOPs?

OOPs is a programming approach based on objects and classes. Its four major principles are Encapsulation, Inheritance, Polymorphism and Abstraction.
---

## Q2. What are the four pillars of OOPs?

The four pillars are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
---

## Q3. What is encapsulation?

Encapsulation means wrapping data and methods together and restricting direct access to data using access modifiers.
---

## Q4. What is inheritance?

Inheritance allows a child class to acquire properties and behaviors of a parent class.
---

Q5. What is polymorphism?

Polymorphism means one name having multiple forms.

It is mainly achieved through:

Method overloading
Method overriding
---

Q6. What is abstraction?

Abstraction means hiding implementation details and exposing only essential functionality.

It is achieved using abstract classes and interfaces.
---

Q7. Difference between overloading and overriding?

Overloading occurs at compile time and uses different parameter lists.

Overriding occurs at runtime and requires a parent-child relationship with the same method signature.
---

Q8. Can we overload a method by changing only the return type?

No.

Return type alone cannot differentiate overloaded methods.
---

Q9. Can we override a static method?

No.

Static methods are hidden, not overridden.
---

Q10. Can we override a final method?

No.

A final method cannot be overridden.
---

Q11. Can we create an object of an abstract class?

No.
```java
An abstract class cannot be directly instantiated.

abstract class Animal {
}
```
This is invalid:
```java
Animal a = new Animal();
```
---

## Q12. Can an abstract class have a constructor?

Yes.

An abstract class can have constructors.
---

Q13. Can an interface have a constructor?

No.

Interfaces cannot have constructors.
---

Q14. Can we create a reference of an abstract class?

Yes.
```java
Animal a = new Dog();
```
---

## Q15. Why is multiple inheritance not supported through classes?

Because it can create ambiguity, commonly known as the diamond problem.

Java provides interfaces as a solution for multiple inheritance of type.
