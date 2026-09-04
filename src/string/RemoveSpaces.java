package string;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "Java Developer";

        String result = str.replace(" ", "");

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + result);
    }
}
