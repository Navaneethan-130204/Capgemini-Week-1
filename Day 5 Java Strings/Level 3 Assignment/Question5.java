import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

    public static char[] UniqueCharacters(String text) {
        char[] uniqueChar = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                uniqueChar[i] = currentChar;
            }
        }
        return uniqueChar;
    }

    public static String[][] Frequency (String text) {
        char[] uniqueChar = UniqueCharacters(text);
        int[] freq = new int[256];

        for (int i = 0 ; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueChar.length][2];
        for (int i = 0; i < uniqueChar.length; i++) {
            result[i][0] = String.valueOf(uniqueChar[i]);
            result[i][1] = String.valueOf(freq[uniqueChar[i]]);
        }
        return result;
    }

    public static void displayResult(String[][] frequency) {
        System.out.println("----------------------------");
        System.out.printf("%-15s %-15s\n", "Character", "Frequency");
        System.out.println("----------------------------");

        for (String[] row : frequency) {
            System.out.printf("%-15s %-15s\n", row[0], row[1]);
        }

        System.out.println("----------------------------");
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.nextLine();
        char[] uniqueChar = UniqueCharacters(text);
        String[][] frequency = Frequency(text);
        displayResult(frequency);

        input.close();
    }

}
