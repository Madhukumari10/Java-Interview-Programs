# Core Java Notes

## 1. What is Java?

Java is a high-level, object-oriented, class-based programming language developed by Sun Microsystems.

Java is widely used for building desktop applications, web applications, backend systems, enterprise applications and Android applications.

### Key Features of Java

- Object-Oriented
- Platform Independent
- Simple
- Secure
- Robust
- Portable
- Multithreaded
- Distributed
- High Performance
- Automatic Garbage Collection

---

## 2. How Java Works

Java follows the concept:

Source Code → Compiler → Bytecode → JVM → Machine Code

Example:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}


```

---
## 2. How Java Works

Java follows the principle:

**Write Once, Run Anywhere (WORA)**

Java source code is written in a `.java` file.

The Java compiler converts the source code into **bytecode**.

The bytecode is stored in a `.class` file.

The JVM executes this bytecode.

### Flow

```text
Java Source Code
       ↓
    Compiler
       ↓
   Bytecode
       ↓
      JVM
       ↓
Operating System
````

### Example

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## 3. JDK, JRE and JVM

### JVM

JVM stands for **Java Virtual Machine**.

It is responsible for executing Java bytecode.

### JRE

JRE stands for **Java Runtime Environment**.

Conceptually, it provides the JVM and libraries required to run Java applications.

### JDK

JDK stands for **Java Development Kit**.

It contains tools required to develop and run Java applications, including the compiler.

### Difference

| Component | Purpose                                         |
| --------- | ----------------------------------------------- |
| JVM       | Executes bytecode                               |
| JRE       | Provides environment to run Java programs       |
| JDK       | Provides tools to develop and run Java programs |

### Simple Relationship

```text
JDK
 └── JRE
      └── JVM
```

---

## 4. Variables

A variable is a named memory location used to store data.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
int age = 25;
String name = "Madhu";
double salary = 45000.50;
```

### Types of Variables

* Local Variable
* Instance Variable
* Static Variable

### Local Variable

Declared inside a method, constructor or block.

```java
public void show() {
    int age = 25;
    System.out.println(age);
}
```

### Instance Variable

Declared inside a class but outside methods.

```java
class Student {

    int age;
    String name;
}
```

### Static Variable

Declared using the `static` keyword.

```java
class Student {

    static String college = "ABC College";
}
```

---

## 5. Data Types

Java has two main categories of data types:

* Primitive Data Types
* Non-Primitive Data Types

### Primitive Data Types

| Data Type |          Size | Example                |
| --------- | ------------: | ---------------------- |
| byte      |        1 byte | `byte a = 10;`         |
| short     |       2 bytes | `short a = 100;`       |
| int       |       4 bytes | `int a = 1000;`        |
| long      |       8 bytes | `long a = 10000L;`     |
| float     |       4 bytes | `float a = 10.5f;`     |
| double    |       8 bytes | `double a = 10.5;`     |
| char      |       2 bytes | `char a = 'A';`        |
| boolean   | JVM-dependent | `boolean flag = true;` |

### Non-Primitive Data Types

Examples:

* String
* Arrays
* Classes
* Objects
* Interfaces

---

## 6. Type Casting

Type casting means converting one data type into another.

### Widening Casting

Smaller type → Larger type.

It is performed automatically.

```java
int number = 100;
double value = number;

System.out.println(value);
```

### Narrowing Casting

Larger type → Smaller type.

It requires explicit casting.

```java
double value = 100.50;
int number = (int) value;

System.out.println(number);
```

---

## 7. Operators

Operators are symbols used to perform operations.

### Arithmetic Operators

```text
+  -  *  /  %
```

Example:

```java
int a = 10;
int b = 5;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

### Relational Operators

```text
==  !=  >  <  >=  <=
```

### Logical Operators

```text
&&  ||  !
```

Example:

```java
int age = 25;

System.out.println(age > 18 && age < 60);
```

### Assignment Operators

```text
=  +=  -=  *=  /=  %=
```

### Unary Operators

```text
++  --
```

### Ternary Operator

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

---

## 8. Conditional Statements

Conditional statements are used to make decisions.

### if Statement

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible");
}
```

### if-else

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### else-if

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else {
    System.out.println("Fail");
}
```

### switch

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

---

## 9. Loops

Loops are used to execute a block of code repeatedly.

### for Loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### while Loop

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### do-while Loop

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Enhanced for Loop

```java
int[] numbers = {10, 20, 30, 40};

for (int number : numbers) {
    System.out.println(number);
}
```

### break

Used to terminate a loop.

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

### continue

Used to skip the current iteration.

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

---

## 10. Arrays

An array stores multiple values of the same data type.

### Declaration

```java
int[] numbers = new int[5];
```

### Initialization

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Accessing Elements

```java
System.out.println(numbers[0]);
```

Array indexing starts from `0`.

### Traversing Array

```java
int[] numbers = {10, 20, 30, 40};

for (int number : numbers) {
    System.out.println(number);
}
```

### Important Points

* Array size is fixed.
* Index starts from 0.
* Arrays store elements of the same type.
* Arrays are objects in Java.
* Array length is accessed using `length`.

---

## 11. String

String is a sequence of characters.

```java
String name = "Madhu";
```

### String is Immutable

Once a String object is created, its content cannot be changed.

```java
String name = "Java";

name.concat(" Programming");

System.out.println(name);
```

Output:

```text
Java
```

### Common String Methods

```java
String text = "Java Programming";

System.out.println(text.length());
System.out.println(text.toUpperCase());
System.out.println(text.toLowerCase());
System.out.println(text.charAt(0));
System.out.println(text.substring(0, 4));
System.out.println(text.contains("Java"));
```

### String Comparison

Use `equals()` to compare String contents.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

`==` compares references for objects, while `equals()` generally compares logical content when the class overrides it.

---

## 12. StringBuilder and StringBuffer

### StringBuilder

StringBuilder is mutable and is generally preferred when thread synchronization is not required.

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

### StringBuffer

StringBuffer is mutable and synchronized.

```java
StringBuffer sb = new StringBuffer("Java");

sb.append(" Programming");

System.out.println(sb);
```

### Difference

| String                           | StringBuilder          | StringBuffer                          |
| -------------------------------- | ---------------------- | ------------------------------------- |
| Immutable                        | Mutable                | Mutable                               |
| Thread-safe through immutability | Not synchronized       | Synchronized                          |
| Good for fixed text              | Fast for modifications | Useful when synchronization is needed |

---

## 13. Class and Object

### Class

A class is a blueprint or template for creating objects.

```java
class Student {

    String name;
    int age;
}
```

### Object

An object is an instance of a class.

```java
Student student = new Student();
```

### Example

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Madhu";
        student.age = 25;

        student.display();
    }
}
```

---

## 14. Constructor

A constructor is used to initialize an object.

### Important Points

* Constructor name must be same as class name.
* Constructor does not have a return type.
* It is called automatically when an object is created.
* Constructors can be overloaded.

### Example

```java
class Student {

    String name;
    int age;

    Student() {
        System.out.println("Constructor called");
    }
}
```

### Parameterized Constructor

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 15. this Keyword

`this` refers to the current object.

### Example

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Here:

```text
this.name
```

refers to the instance variable.

---

## 16. static Keyword

The `static` keyword belongs to the class rather than individual objects.

### Static Variable

```java
class Student {

    static String college = "ABC College";
}
```

### Static Method

```java
class Test {

    static void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test.display();
    }
}
```

### Important Points

* Static members belong to the class.
* Static methods can be called using the class name.
* A static method cannot directly access non-static instance members.

---

## 17. Encapsulation

Encapsulation means wrapping data and methods together and controlling access to the data.

Usually, fields are made `private` and accessed using getters and setters.

### Example

```java
class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### Benefits

* Data hiding
* Security
* Controlled access
* Better maintainability

---

## 18. Inheritance

Inheritance allows one class to acquire properties and behavior of another class.

It is achieved using the `extends` keyword for classes.

### Example

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
```

```java
public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}
```

### Types of Inheritance in Java

* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance

Java does not support multiple inheritance through classes.

Multiple inheritance of type can be achieved through interfaces.

---

## 19. Polymorphism

Polymorphism means **many forms**.

There are two main types:

* Compile-time Polymorphism
* Runtime Polymorphism

### Method Overloading

Same method name with different parameters.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Method Overriding

A child class provides its own implementation of a parent class method.

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### Runtime Polymorphism

```java
Animal animal = new Dog();

animal.sound();
```

The overridden method of `Dog` is executed at runtime.

---

## 20. Abstraction

Abstraction means hiding implementation details and showing only essential information.

Abstraction can be achieved using:

* Abstract classes
* Interfaces

### Abstract Class

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}
```

### Child Class

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Barking");
    }
}
```

---

## 21. Interface

An interface defines a contract that implementing classes follow.

A class uses the `implements` keyword to implement an interface.

### Example

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
```

### Important Points

* A class can implement multiple interfaces.
* Interfaces support abstraction.
* Interface methods can include abstract methods and, since Java 8, default and static methods.
* Interface fields are implicitly `public`, `static` and `final`.

---

## 22. Access Modifiers

Access modifiers control the visibility of classes, methods and variables.

| Modifier  | Same Class | Same Package | Subclass in Other Package | Other Package |
| --------- | ---------- | ------------ | ------------------------- | ------------- |
| private   | Yes        | No           | No                        | No            |
| default   | Yes        | Yes          | No                        | No            |
| protected | Yes        | Yes          | Yes, through inheritance  | No            |
| public    | Yes        | Yes          | Yes                       | Yes           |

### private

Accessible only inside the same class.

### default

If no modifier is specified, access is limited to the same package.

### protected

Accessible in the same package and also in subclasses in other packages through inheritance.

### public

Accessible from anywhere.

---

## 23. Exception Handling

An exception is an event that disrupts the normal flow of program execution.

Java provides exception-handling mechanisms to handle such situations.

### Common Keywords

* try
* catch
* finally
* throw
* throws

### try-catch

```java
public class Test {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
```

### finally

The `finally` block is used for code that should normally execute whether an exception occurs or not.

```java
try {
    System.out.println("Try block");
} catch (Exception e) {
    System.out.println("Catch block");
} finally {
    System.out.println("Finally block");
}
```

### throw

Used to explicitly throw an exception.

```java
throw new IllegalArgumentException("Invalid value");
```

### throws

Used to declare exceptions that a method may pass to its caller.

```java
void readFile() throws IOException {
    // code
}
```

---

## 24. Checked and Unchecked Exceptions

### Checked Exception

Checked exceptions are checked by the compiler.

Examples:

* IOException
* SQLException
* FileNotFoundException

### Unchecked Exception

Unchecked exceptions occur at runtime and are subclasses of `RuntimeException`.

Examples:

* NullPointerException
* ArithmeticException
* ArrayIndexOutOfBoundsException
* NumberFormatException

### Difference

| Checked Exception                                          | Unchecked Exception            |
| ---------------------------------------------------------- | ------------------------------ |
| Checked by compiler                                        | Occurs at runtime              |
| Usually subclasses of Exception excluding RuntimeException | Subclasses of RuntimeException |
| Must be handled or declared                                | Handling is not mandatory      |

---

## 25. Collections Framework

Java Collections Framework provides classes and interfaces for storing and manipulating groups of objects.

Main interfaces include:

* List
* Set
* Queue
* Map

### List

* Allows duplicates.
* Maintains insertion order.

Examples:

* ArrayList
* LinkedList

### Set

* Does not allow duplicate elements.

Examples:

* HashSet
* LinkedHashSet
* TreeSet

### Queue

Used for processing elements generally in a queue-oriented manner.

Examples:

* LinkedList
* PriorityQueue
* ArrayDeque

### Map

Stores data in key-value pairs.

Examples:

* HashMap
* LinkedHashMap
* TreeMap

---

## 26. ArrayList

ArrayList is a resizable array implementation of the `List` interface.

### Example

```java
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Madhu");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(names);
    }
}
```

### Important Points

* Allows duplicates.
* Maintains insertion order.
* Provides fast random access by index.
* Not synchronized by default.

---

## 27. LinkedList

LinkedList is a doubly linked list implementation.

### Example

```java
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Madhu");
        names.add("Rahul");

        names.addFirst("Amit");
        names.addLast("Neha");

        System.out.println(names);
    }
}
```

### Important Points

* Allows duplicates.
* Maintains insertion order.
* Efficient insertion/removal at known linked positions.
* Random access is slower than ArrayList.

---

## 28. HashSet

HashSet stores unique elements.

### Example

```java
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
    }
}
```

The duplicate `10` is not stored twice.

### Important Points

* Does not allow duplicates.
* Does not guarantee insertion order.
* Allows one `null` element.
* Uses hashing internally.

---

## 29. HashMap

HashMap stores data in key-value pairs.

### Example

```java
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Madhu");
        students.put(2, "Rahul");
        students.put(3, "Amit");

        System.out.println(students);
    }
}
```

### Important Points

* Stores key-value pairs.
* Keys are unique.
* Allows one null key.
* Allows multiple null values.
* Does not guarantee insertion order.
* Not synchronized by default.

---

## 30. Stack and Queue

### Stack

Stack follows **LIFO**:

**Last In, First Out**

```java
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
    }
}
```

Output:

```text
30
```

### Queue

Queue generally follows **FIFO**:

**First In, First Out**

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll());
    }
}
```

Output:

```text
10
```

---

## 31. Java 8 Features

Java 8 introduced several important features.

### Major Features

* Lambda Expressions
* Functional Interfaces
* Stream API
* Method References
* Default Methods
* Static Methods in Interfaces
* Optional
* New Date and Time API

### Lambda Expression

Lambda expressions provide a concise way to represent behavior.

```java
interface Greeting {

    void sayHello();
}

public class LambdaExample {

    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Hello Java");

        greeting.sayHello();
    }
}
```

---

## 32. Stream API

Stream API is used to process collections in a functional style.

### filter()

Used to filter elements.

```java
import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
```

Output:

```text
10
20
30
```

### map()

Used to transform elements.

```java
import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("madhu", "rahul", "amit");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
```

Output:

```text
MADHU
RAHUL
AMIT
```

---

## 33. Memory Management

Java manages memory automatically using the JVM and Garbage Collector.

### Stack

Stack stores method call information, local variables and references in stack frames.

### Heap

Heap is the memory area where objects and arrays are allocated.

### Example

```java
Student student = new Student();
```

Conceptually:

* `student` reference is part of the current stack frame.
* The `Student` object is allocated on the heap.

### Garbage Collection

Garbage Collection automatically removes objects that are no longer reachable by the application.

---

## 34. Java is Platform Independent

Java source code is compiled into bytecode.

Bytecode can run on different operating systems when a compatible JVM is available.

```text
Java Code
    ↓
Compiler
    ↓
Bytecode
    ↓
JVM
    ↓
Windows / Linux / macOS
```

Therefore Java is commonly described as:

**Write Once, Run Anywhere.**

The JVM itself is platform-specific, while Java bytecode is designed to be platform-independent.

---

# Important Java Interview Questions

## Basic Questions

1. What is Java?
2. What are the main features of Java?
3. Why is Java platform independent?
4. What is JVM?
5. What is JDK?
6. What is JRE?
7. Difference between JDK, JRE and JVM.
8. What is bytecode?
9. What is a class?
10. What is an object?

## OOPs Questions

11. What is OOP?
12. What are the four pillars of OOP?
13. What is encapsulation?
14. What is inheritance?
15. What is polymorphism?
16. What is abstraction?
17. Difference between method overloading and overriding.
18. Difference between abstract class and interface.
19. Can Java support multiple inheritance?
20. What is the `this` keyword?
21. What is the `super` keyword?
22. What is a constructor?
23. Can constructors be overloaded?

## String Questions

24. Why is String immutable in Java?
25. Difference between `==` and `equals()`.
26. Difference between String, StringBuilder and StringBuffer.
27. What is String Pool?
28. What is the difference between `String s = "Java"` and `new String("Java")`?

## Collections Questions

29. What is the Java Collections Framework?
30. Difference between List, Set and Map.
31. Difference between ArrayList and LinkedList.
32. Difference between HashSet and TreeSet.
33. Difference between HashMap and Hashtable.
34. How does HashMap work?
35. Can HashMap contain null values?
36. Can HashMap contain duplicate keys?
37. Difference between ArrayList and Vector.
38. What is the difference between HashMap and ConcurrentHashMap?

## Exception Questions

39. What is an exception?
40. Difference between checked and unchecked exceptions.
41. Difference between `throw` and `throws`.
42. What is finally?
43. Can finally block execute without catch?
44. What is the difference between final, finally and finalize?

## Java 8 Questions

45. What is Lambda Expression?
46. What is Functional Interface?
47. What is Stream API?
48. Difference between `map()` and `filter()`.
49. What is Optional?
50. What is a method reference?
51. What are default methods in interfaces?

---

# Quick Revision

### OOPs

```text
Encapsulation → Data Hiding
Inheritance   → Reusability
Polymorphism  → Many Forms
Abstraction   → Hiding Implementation
```

### Collections

```text
List  → Allows duplicates
Set   → Unique elements
Map   → Key-Value pairs
Queue → Processing elements in queue order
```

### Java 8

```text
Lambda
Functional Interface
Stream API
Method Reference
Optional
Default Methods
```

### Exception Handling

```text
try
catch
finally
throw
throws
```

### Access Modifiers

```text
private
default
protected
public
```

---

# Remember

* Java is object-oriented and class-based.
* Java source code is compiled into bytecode.
* JVM executes bytecode.
* JDK is used for Java development.
* JRE conceptually provides the runtime environment.
* Java supports method overloading and method overriding.
* Encapsulation provides data hiding.
* Inheritance provides reusability.
* Polymorphism means many forms.
* Abstraction hides implementation details.
* String is immutable.
* ArrayList is a resizable array.
* HashSet stores unique elements.
* HashMap stores key-value pairs.
* Stack follows LIFO.
* Queue generally follows FIFO.
* Lambda expressions were introduced in Java 8.
* Stream API is used for processing data in a functional style.
* Garbage Collection manages unreachable objects automatically.

````
