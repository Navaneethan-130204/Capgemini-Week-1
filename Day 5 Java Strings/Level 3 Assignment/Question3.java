import java.util.Scanner;

public class Question3 {

    public static char NonRepeatingCharacter (String text) {
        int[] unique = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            unique[ch]++;
        }

        System.out.println("----------------------------");
        System.out.printf("%-15s %-15s\n", "Character" , "Frequency");
        System.out.println("----------------------------");
        boolean[] printed = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!printed[ch]) {
                System.out.printf("%-15s %-15d\n", ch, unique[ch]);
                printed[ch] = true;
            }
        }
        System.out.println("----------------------------");

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.nextLine();
        char uniqueChar = NonRepeatingCharacter(text);
        if(uniqueChar != '\0') {
            System.out.print("The First Non-Repeating Character: " + uniqueChar);
        }
        else {
            System.out.println("No non-repeating character found.");
        }
    }
}
