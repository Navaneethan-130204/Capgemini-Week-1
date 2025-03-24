import java.util.Arrays;
import java.util.Scanner;
public class Question2 {

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
            if (text.charAt(i) == ' ') {
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

    public static boolean CompareString(String[] text1, String[] text2) {
        if (text1.length != text2.length) {
            return false;
        }
        for (int i = 0; i < text1.length; i++) {
            if(!text1[i].equals(text2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.nextLine();
        int length = StringLength(text);
        String[] manual = SplittingWords(text);
        String[] builtin = text.split(" ");
        boolean compare = CompareString(manual, builtin);
        System.out.println("Splitting Words using Manual method: " + Arrays.toString(manual));
        System.out.println("Splitting words using using BuiltIn method: " + Arrays.toString(builtin));
        System.out.println("Both are equal? " + compare);

        input.close();
    }
}
