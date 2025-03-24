import java.util.Scanner;
public class Question5 {

    public static void Exception (String text) {
        for (int i = 0; i <= text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
    }

    public static void StringIndexOutOfBoundsException (String text) {
        try {
            for (int i = 0; i <= text.length(); i++) {
                System.out.print(text.charAt(i) + " ");
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nStringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.next();
        Exception(text);
        StringIndexOutOfBoundsException(text);
    }
}
