package oops;

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeywordExample {

    public static void main(String[] args) {

        Person person = new Person("Madhu", 28);

        person.displayDetails();
    }
}
