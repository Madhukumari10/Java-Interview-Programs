package string;

public class CharacterCount {

    public static void main(String[] args) {

        String str = "Java Developer";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Number of Characters: " + count);
    }
}
