import java.util.Arrays;
import java.util.Scanner;
public class Question2 {

    public static int StringLength (String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        return count;
    }

    public static char[] UniqueCharacters (String text) {
        int length = StringLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = uniqueChars[i];
        }

        return finalUniqueChars;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        System.out.print("String Length: " + StringLength(text));

        char[] unique = UniqueCharacters(text);
        System.out.print("\nUnique Characters: " + Arrays.toString(unique));
        input.close();
    }
}
