import java.util.Arrays;
import java.util.Scanner;
public class Question3 {

    public static char[] StringToCharacter (String text) {
        char[] character = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            character[i] = text.charAt(i);
        }
        return character;
    }

    public static boolean StringCompare(char[] text1, char[] text2) {
        return Arrays.equals(text1, text2);
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = input.next();

        char[] stringToCharacter = StringToCharacter(text);
        char[] manual = text.toCharArray();

        boolean compare = StringCompare(stringToCharacter, manual);
        System.out.println("\nString to Character Array: " + Arrays.toString(stringToCharacter));
        System.out.println("String to Character using toCharArray(): " + Arrays.toString(manual));
        System.out.println("Are both  equal? " + compare);

    }
}
