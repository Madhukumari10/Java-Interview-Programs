package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> students = new LinkedList<>();

        students.add("Madhu");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("Students: " + students);

        students.add(1, "Amit");

        System.out.println("After Adding Amit: " + students);

        students.remove("Rahul");

        System.out.println("After Removing Rahul: " + students);

        System.out.println("First Student: " + students.get(0));
        System.out.println("Total Students: " + students.size());
    }
}
