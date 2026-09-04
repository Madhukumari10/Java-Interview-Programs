package string;

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        // == compares references
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        // equals() compares content
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // equalsIgnoreCase()
        String str4 = "java";
        System.out.println("Case-insensitive comparison: "
                + str1.equalsIgnoreCase(str4));
    }
}
