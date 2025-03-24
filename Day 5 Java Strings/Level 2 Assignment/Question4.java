import javax.swing.text.TabExpander;
import java.util.Arrays;
import java.util.Scanner;
public class Question4 {

    public static int StringLength (String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(++count);
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] SplittingWords (String text) {
        int length = StringLength(text);
        int count = 0;
        int wordStart = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' && (i > 0 && text.charAt(i - 1) != ' ')) {
                count++;
            }
        }
        String[] words = new String[count + 1];
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);
        return words;
    }

    public static String[][] WordCount(String[] text) {
        int length = text.length;
        String[][] details = new String[length][2];
        for (int i = 0; i < length; i++) {
            details[i][0] = text[i];
            details[i][1] = String.valueOf(StringLength(text[i]));
        }
        return details;
    }

    public static String[] ShortestAndLongest (String[][] text) {
        String shortest = text[0][0];
        String longest = text[0][0];

        int minLength = StringLength(text[0][0]);
        int maxLength = StringLength(text[0][0]);
        for (int i = 0; i < text.length; i++) {
            int length = Integer.parseInt(text[i][1]);
            if (length < minLength) {
                minLength = length;
                shortest = text[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = text[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        int length = StringLength(text);
        System.out.println("The length of the string is " + length);

        String[] splitting = SplittingWords(text);
        System.out.println("Splitted words :" + Arrays.toString(splitting));

        String[][] count = WordCount(splitting);
        System.out.println("-------------------------");
        System.out.printf("%-15s %-15s\n","Words","Count");
        System.out.println("-------------------------");
        for (String[] i : count) {
            System.out.printf("%-15s %-15s\n", i[0], i[1]);
        }
        System.out.println("-------------------------");

        String[] minMax = ShortestAndLongest(count);
        System.out.println("Smallest Word: " + minMax[0]);
        System.out.println("Largest word: " + minMax[1]);

        input.close();
    }
}
