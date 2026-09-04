package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Madhu");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        System.out.println("Students: " + students);

        // Get value using key
        System.out.println("Student 101: " + students.get(101));

        // Check key
        System.out.println("Contains key 102: "
                + students.containsKey(102));

        // Remove entry
        students.remove(103);

        System.out.println("After Removing 103: " + students);

        System.out.println("Total Students: " + students.size());
    }
}
