package array;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 50, 20, 30};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
