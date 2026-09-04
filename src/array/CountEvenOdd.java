package array;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 7, 30, 41};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
