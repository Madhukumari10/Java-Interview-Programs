package array;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 7, 30, 41};

        System.out.println("Even Numbers:");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nOdd Numbers:");

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
