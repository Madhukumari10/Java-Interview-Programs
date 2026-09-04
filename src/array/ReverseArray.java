package array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nReversed Array:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
