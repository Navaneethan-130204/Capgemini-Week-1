import java.util.Arrays;
import java.util.Scanner;
public class Question3 {

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

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int length = StringLength(text);
        System.out.println("The length of the string is " + length);

        String[] splitting = SplittingWords(text);
        System.out.println("Splitted words :" + Arrays.toString(splitting));

        String[][] count = WordCount(splitting);
        System.out.println("------------------");
        System.out.printf("%-10s %-10s\n","Words","Count");
        System.out.println("------------------");
        for (String[] i : count) {
            System.out.printf("%-10s %-10s\n", i[0], i[1]);
        }
        System.out.println("------------------");

        input.close();
    }
}
