package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        // Add elements
        students.add("Madhu");
        students.add("Rahul");
        students.add("Priya");

        // Get element
        System.out.println("First Student: " + students.get(0));

        // Display all students
        System.out.println("Students:");

        for (String student : students) {
            System.out.println(student);
        }

        // Remove element
        students.remove("Rahul");

        System.out.println("After Removing Rahul: " + students);

        // Size
        System.out.println("Total Students: " + students.size());
    }
}
