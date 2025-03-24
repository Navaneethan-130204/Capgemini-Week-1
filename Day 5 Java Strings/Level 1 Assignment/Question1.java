import java.util.Scanner;
public class Question1 {

    public static boolean StringCompare (String text1, String text2) {
        boolean isEqual = true;
        if(text1.length() != text2.length()) {
            isEqual= false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == text2.charAt(i)) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text1: ");
        String text1 = input.nextLine();
        System.out.print("Enter the text2: ");
        String text2 = input.nextLine();

        boolean result = StringCompare(text1, text2);
        boolean equalsMethodComparison = text1.equals(text2);
        System.out.println("Comparison using charAt(): " + result);
        System.out.println("Comparison using equals(): " + equalsMethodComparison);
        if (result) {
            System.out.println("Equal.");
        }
        else {
            System.out.println("Not Equal.");
        }

        input.close();
    }
}
