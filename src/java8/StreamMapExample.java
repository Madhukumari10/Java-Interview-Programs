package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "madhu", "rahul", "priya"
        );

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original Names: " + names);
        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
