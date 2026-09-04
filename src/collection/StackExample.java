package collection;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Spring Boot");
        stack.push("Hibernate");

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        stack.pop();

        System.out.println("After Pop: " + stack);

        System.out.println("Is Stack Empty: " + stack.isEmpty());
    }
}
