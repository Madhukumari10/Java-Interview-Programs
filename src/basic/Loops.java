package basic;

public class Loops {

    public static void main(String[] args) {

        // for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
