package oops;

class Employee {

    String name;
    int age;

    // Constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Employee employee = new Employee("Madhu", 28);

        employee.displayDetails();
    }
}
