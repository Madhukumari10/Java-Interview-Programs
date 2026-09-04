package basic;

public class ArraysExample {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("First Mark: " + marks[0]);

        System.out.println("All Marks:");

        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Total Students: " + marks.length);
    }
}
