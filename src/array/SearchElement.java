package array;

public class SearchElement {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int searchElement = 30;
        boolean found = false;

        for (int number : numbers) {

            if (number == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchElement + " is present in the array.");
        } else {
            System.out.println(searchElement + " is not present in the array.");
        }
    }
}
