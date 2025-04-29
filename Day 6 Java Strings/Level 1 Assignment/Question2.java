import java.util.Scanner;
public class Question2 {

    public static String SubString(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean CompareString (String text1, String text2) {
        if(text1.equals(text2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = input.next();

        System.out.print("Enter the starting index for the substring: ");
        int start = input.nextInt();

        System.out.print("Enter the ending index for the substring: ");
        int end = input.nextInt();

        String subString = SubString(text, start, end);
        String manual = text.substring(start, end);
        boolean compare = CompareString(manual, subString);
        System.out.println("\nSubstring using charAt(): " + manual);
        System.out.println("Substring using substring(): " + subString);
        System.out.println("Are both substrings equal? " + compare);

        input.close();
    }
}
