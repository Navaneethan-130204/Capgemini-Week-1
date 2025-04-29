import java.util.Scanner;

public class Question4 {

    public static String[][] Frequency (String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if(freq[i] > 0) {
                count++;
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void DisplayResult (String [][] frequency) {
        System.out.println("--------------------------");
        System.out.printf("%-15s %-15s\n", "Character", "Frequency");
        System.out.println("--------------------------");
        for (String[] rows: frequency) {
            System.out.printf("%-15s %-15s\n", rows[0], rows[1]);
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();
        String [][] frequency = Frequency(text);
        DisplayResult(frequency);

        input.close();
    }
}
