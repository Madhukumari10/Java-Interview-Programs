package string;

public class StringBasics {

    public static void main(String[] args) {

        String name = "Madhu Kumari";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Contains Madhu: " + name.contains("Madhu"));
    }
}
