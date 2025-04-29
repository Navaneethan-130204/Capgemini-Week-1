
import java.util.Scanner;

public class Question6 {

    public static String[] Frequency(String text) {
        char[] character = text.toCharArray();
        int[] freq = new int[character.length];
        for (int i = 0; i < text.length(); i++) {
            if(character[i] == '0') {
                continue;
            }
            freq[i] = 1;

            for (int j = i +1; j < text.length(); j++){
                if (character[i] == character[j]) {
                    freq[i]++;
                    character[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (character[i] != '0'){
                count++;
            }
        }
        int index = 0;
        String[] result = new String[count];
        for (int i = 0; i < text.length(); i++){
            if (character[i] != '0') {
                result[index] = character[i] + " - " + freq[i];
                index++;
            }
        }
        return result;
    }

    public static void DisplayResult (String[] frequency) {
        System.out.println("--------------------------");
        System.out.printf("%-15s %-15s\n", "Character", "Frequency");
        System.out.println("--------------------------");
        for (String rows: frequency) {
            String[] parts = rows.split(" - ");
            System.out.printf("%-15s %-15s\n", parts[0], parts[1]);
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();
        String[] freq = Frequency(text);
        DisplayResult(freq);

        input.close();
    }
}
