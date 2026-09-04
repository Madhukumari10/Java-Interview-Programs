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
Teacher ---- Student
```
A teacher and student can exist independently.
```

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

## 33. 
