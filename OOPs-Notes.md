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

## 7. 
