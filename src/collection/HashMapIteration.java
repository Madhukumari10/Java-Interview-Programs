package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Madhu");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }
    }
}
