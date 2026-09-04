package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> students = new HashSet<>();

        students.add("Madhu");
        students.add("Rahul");
        students.add("Priya");
        students.add("Madhu");

        System.out.println("Students: " + students);

        System.out.println("Contains Priya: "
                + students.contains("Priya"));

        students.remove("Rahul");

        System.out.println("After Removing Rahul: " + students);

        System.out.println("Total Students: " + students.size());
    }
}
