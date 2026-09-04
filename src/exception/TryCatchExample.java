package exception;

public class TryCatchExample {

    public static void main(String[] args) {

        try {

            int number = 10 / 0;

            System.out.println(number);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide a number by zero.");
        }

        System.out.println("Program continues...");
    }
}
