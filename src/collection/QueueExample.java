package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();

        students.offer("Madhu");
        students.offer("Rahul");
        students.offer("Priya");

        System.out.println("Queue: " + students);

        System.out.println("Front Element: " + students.peek());

        students.poll();

        System.out.println("After Removing First Element: " + students);

        System.out.println("Is Queue Empty: " + students.isEmpty());
    }
}
