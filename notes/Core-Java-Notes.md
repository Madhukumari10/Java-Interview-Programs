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

```markdown
## 3. JDK, JRE and JVM
JVM - Java Virtual Machine

JVM is responsible for executing Java bytecode.

It makes Java platform independent because the same bytecode can run on different operating systems using their respective JVM implementations.

JRE - Java Runtime Environment

JRE provides the environment required to run Java applications.

JRE = JVM + Java Libraries
JDK - Java Development Kit

JDK provides everything required to develop and run Java applications.

JDK = JRE + Development Tools
Simple Difference
JDK	JRE	JVM
Used to develop and run Java applications	Used to run Java applications	Executes bytecode
Contains JRE	Contains JVM	Part of JRE
Contains development tools	Contains libraries	Platform dependent implementation

```markdown
## 4. Variables

A variable is a named memory location used to store data.

Example:

int age = 28;
String name = "Madhu";

Here:

• int is the data type.
• age is the variable.
• 28 is the value.


5. Data Types

Java data types are divided into two categories:

Primitive Data Types

Java has 8 primitive data types:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

Example:

int age = 28;
double salary = 45000.50;
char grade = 'A';
boolean active = true;
Non-Primitive Data Types

Examples:

• String
• Array
• Class
• Interface
• Object


6. Type Casting

Type casting means converting one data type into another.

Widening Casting

Smaller data type → Larger data type

int number = 10;
double value = number;

This happens automatically.

Narrowing Casting

Larger data type → Smaller data type

double value = 10.5;
int number = (int) value;

This requires explicit casting.


7. Operators

Operators are symbols used to perform operations on variables and values.

Arithmetic Operators
+   Addition
-   Subtraction
*   Multiplication
/   Division
%   Modulus

Example:

int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);


Relational Operators
==   Equal to
!=   Not equal to
>    Greater than
<    Less than
>=   Greater than or equal to
<=   Less than or equal to

These operators return true or false.


Logical Operators
&&   Logical AND
||   Logical OR
!    Logical NOT

Example:

int age = 25;

if (age >= 18 && age <= 60) {
    System.out.println("Eligible");
}
Assignment Operators
= 
+=
-=
*=
/=
%=

Example:

int number = 10;
number += 5;
Increment and Decrement
++   Increment
--   Decrement

Example:

int number = 10;

number++;
number--;
Ternary Operator

The ternary operator is a short form of if-else.

int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";


8. Conditional Statements

Conditional statements are used to execute code based on conditions.

if Statement
if (age >= 18) {
    System.out.println("Adult");
}
if-else Statement
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
else-if Statement

Used when multiple conditions need to be checked.

if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
switch Statement

Used when one value needs to be compared with multiple cases.

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


9. Loops

Loops are used to execute a block of code repeatedly.

for Loop
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
while Loop
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
do-while Loop

The do-while loop executes at least once.

int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
Enhanced for Loop

Commonly used for arrays and collections.

int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}


10. break and continue
break

break terminates the loop.

for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
continue

continue skips the current iteration.

for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}


11. Methods

A method is a block of code designed to perform a specific task.

Example:

public static int add(int a, int b) {
    return a + b;
}

Calling the method:

int result = add(10, 20);
System.out.println(result);

Types of Methods
• Method with return value
• Method without return value
• Method with parameters
• Method without parameters

12. Method Overloading

Method overloading means having multiple methods with the same name but different parameters.

Example:

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

Method overloading is an example of compile-time polymorphism.

13. Constructor

A constructor is used to initialize an object.

Example:

class Student {

    String name;

    Student() {
        name = "Madhu";
    }
}
Important Points
• Constructor name must be the same as the class name.
• Constructor does not have a return type.
• Constructor is called automatically when an object is created.
• Constructors can be overloaded.

14. this Keyword

this refers to the current object.

Example:

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

Here, this.name refers to the instance variable.

15. static Keyword

The static keyword is used for members that belong to the class rather than individual objects.

Example:

class Employee {

    static String company = "ABC";
}

A static variable is shared among all objects of the class.

Static Method
static void display() {
    System.out.println("Hello");
}

Static methods can be called using the class name.

Employee.display();


16. final Keyword

The final keyword can be used with variables, methods and classes.

final Variable

Its value cannot be changed.

final int MAX_VALUE = 100;
final Method

A final method cannot be overridden.

final Class

A final class cannot be inherited.

Example:

final class A {
}


17. Arrays

An array is used to store multiple values of the same data type.

Example:

int[] numbers = {10, 20, 30, 40, 50};

Accessing an element:

System.out.println(numbers[0]);

Array indexing starts from 0.

Finding array length:

System.out.println(numbers.length);


18. String

String is used to store a sequence of characters.

Example:

String name = "Madhu";

Strings are objects in Java.

Example:

String firstName = "Madhu";
String lastName = "Kumari";

Common String methods:

length()
charAt()
equals()
equalsIgnoreCase()
toUpperCase()
toLowerCase()
substring()
contains()
replace()
trim()


19. String vs StringBuilder vs StringBuffer
String

String is immutable.

String name = "Java";
name = name + " Programming";

A new String object may be created when the value changes.

StringBuilder

StringBuilder is mutable and generally preferred when frequent string modifications are needed in a single-threaded context.

StringBuilder builder = new StringBuilder("Java");
builder.append(" Programming");
StringBuffer

StringBuffer is mutable and synchronized, making it thread-safe but generally slower than StringBuilder.

20. Object-Oriented Programming

Java is primarily an object-oriented programming language.

The four major OOP concepts are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

Other important concepts include:

• Class
• Object
• Interface
• Constructor


21. Encapsulation

Encapsulation means wrapping data and methods together and restricting direct access to data.

Usually achieved using:

• private variables
• public getters
• public setters

Example:

class Employee {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


22. Inheritance

Inheritance allows one class to acquire properties and behavior of another class.

Example:

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

Here, Dog inherits from Animal.


23. Polymorphism

Polymorphism means one name having multiple forms.

Two common types:

Compile-Time Polymorphism

Achieved using method overloading.

Runtime Polymorphism

Achieved using method overriding.

Example:

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


24. Abstraction

Abstraction means hiding implementation details and showing only essential functionality.

It can be achieved using:

• Abstract classes
• Interfaces

Example:

abstract class Vehicle {

    abstract void start();
}


25. Interface

An interface defines a contract that implementing classes follow.

Example:

interface Payment {

    void pay();
}

class CreditCardPayment implements Payment {

    public void pay() {
        System.out.println("Payment successful");
    }
}


26. Access Modifiers

Java provides four main access levels:

Modifier	    Same Class	  Same Package	  Subclass	  Other Package
private	        Yes	            No	           No	          No
default	        Yes	           Yes	           No     	    No
protected	      Yes            Yes	          Yes	          No
public	        Yes	           Yes	          Yes	         Yes

default means no explicit access modifier is used.

27. Exception Handling

Exception handling is used to handle runtime problems without abruptly terminating the application.

Main keywords:

• try
• catch
• finally
• throw
• throws

Example:

try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}


28. Checked and Unchecked Exceptions
Checked Exception

Checked exceptions are checked at compile time.

Examples:

• IOException
• SQLException
• ClassNotFoundException

Unchecked Exception

Unchecked exceptions occur at runtime.

Examples:

• NullPointerException
• ArithmeticException
• ArrayIndexOutOfBoundsException
• NumberFormatException


29. Collections Framework

The Java Collections Framework provides classes and interfaces for storing and manipulating groups of objects.

Important interfaces:

• List
• Set
• Map
• Queue

Common implementations:

• ArrayList
• LinkedList
• HashSet
• HashMap
• PriorityQueue


30. Wrapper Classes

Wrapper classes convert primitive data types into objects.

Primitive	Wrapper
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean

Example:

int number = 10;

Integer value = number;

This automatic conversion is called autoboxing.


31. Autoboxing and Unboxing
Autoboxing

Primitive → Wrapper Object

int number = 10;
Integer value = number;
Unboxing

Wrapper Object → Primitive

Integer value = 10;
int number = value;


32. Garbage Collection

Garbage Collection is the automatic process of removing objects that are no longer reachable by the application.

Java manages memory automatically using the Garbage Collector.

Example:

Student student = new Student();

student = null;

The previously referenced object may become eligible for garbage collection.


33. Stack and Heap Memory
Stack Memory

Used for:

• Method calls
• Local variables
• References associated with method execution

Heap Memory

Used for:

• Objects
• Instance data

Example:

Student student = new Student();

The object is created in heap memory, while the local reference variable is associated with the current stack frame.

34. Java is Platform Independent

Java follows:

Write Once, Run Anywhere

Java source code is compiled into bytecode.

The bytecode can run on different operating systems using compatible JVM implementations.

Important Interview Questions

Q1. Why is Java platform independent?
Because Java source code is compiled into bytecode, and the bytecode can run on different operating systems using their JVM implementations.

Q2. What is the difference between JDK, JRE and JVM?
• JDK is used for Java development and includes runtime components and development tools.
• JRE provides the runtime environment.
• JVM executes Java bytecode.

Q3. Is Java completely object-oriented?
No. Java also supports primitive data types such as int, char, boolean, etc.

Q4. What is bytecode?
Bytecode is the intermediate code generated by the Java compiler and stored in .class files.

Q5. What is the difference between == and equals()?
== generally compares primitive values or object references.

equals() is a method used to compare object contents when the class provides an appropriate implementation.

Q6. What is method overloading?
Having multiple methods with the same name but different parameter lists is called method overloading.

Q7. What is method overriding?
When a subclass provides its own implementation of a method inherited from its parent class, it is called method overriding.

Q8. What is the difference between String and StringBuilder?
String is immutable, while StringBuilder is mutable.

Q9. What is inheritance?
Inheritance allows a child class to acquire properties and behavior from a parent class.

Q10. What is encapsulation?
Encapsulation means bundling data and methods together and controlling access to the data.

Q11. What is abstraction?
Abstraction hides implementation details and exposes only the required functionality.

Q12. What is polymorphism?
Polymorphism allows the same interface or method name to represent different behaviors.

Q13. What is garbage collection?
Garbage collection automatically reclaims memory from objects that are no longer reachable.

Q14. What are the 8 primitive data types in Java?
byte
short
int
long
float
double
char
boolean

Q15. What is the difference between checked and unchecked exceptions?
Checked exceptions are checked at compile time, while unchecked exceptions occur at runtime.

Quick Revision
Java
 ↓
Object-Oriented
 ↓
Platform Independent
 ↓
Source Code (.java)
 ↓
Compiler
 ↓
Bytecode (.class)
 ↓
JVM
 ↓
Machine Code

**Remember**
• JDK → Development + Runtime
• JRE → Runtime Environment
• JVM → Executes Bytecode
• OOPs → Encapsulation, Inheritance, Polymorphism, Abstraction
• String → Immutable
• StringBuilder → Mutable
• Array → Fixed Size
• Collection → Dynamic Data Structures
• == → Primitive values / object references
• equals() → Object content comparison when properly implemented
• final → Prevents modification/overriding/inheritance depending on usage
• static → Belongs to the class
• this → Current object
• Constructor → Initializes objects
• Garbage Collection → Automatic memory management



