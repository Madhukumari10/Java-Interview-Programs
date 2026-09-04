package basic;

public class ConditionalStatements {

    public static void main(String[] args) {

        int marks = 75;

        // if-else
        if (marks >= 60) {
            System.out.println("First Division");
        } else {
            System.out.println("Below First Division");
        }

        // else-if
        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Ternary Operator
        String result = marks >= 40 ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
