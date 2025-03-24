import java.util.Scanner;

public class Question6 {

    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsAndConsonants(String input) {
        String[][] results = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            results[i][0] = Character.toString(ch);
            results[i][1] = checkCharacterType(ch);
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nCharacter Classification:");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("-------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] results = findVowelsAndConsonants(input);
        displayResults(results);
    }
}
