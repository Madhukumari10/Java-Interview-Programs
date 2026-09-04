package string;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        char[] characters = str.toCharArray();

        System.out.println("Duplicate characters:");

        for (int i = 0; i < characters.length; i++) {

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    System.out.println(characters[i]);
                    break;
                }
            }
        }
    }
}
