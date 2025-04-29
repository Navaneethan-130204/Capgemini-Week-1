import java.util.Scanner;
public class Question9 {

    public static String LowerToUpperCase(String text) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr.append((char) (ch - 32));
            }
            else {
                arr.append(ch);
            }
        }
        return arr.toString();
    }

    public static boolean CompareStrings (String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        String upper = LowerToUpperCase(text);
        String builtin = text.toUpperCase();
        boolean compare = CompareStrings(upper, builtin);
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Manually Converted Uppercase: " + upper);
        System.out.println("Built-in toUpperCase() Result: " + builtin);
        System.out.println("Are both equal? " + compare);
    }

}
