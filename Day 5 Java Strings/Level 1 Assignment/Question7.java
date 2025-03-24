import java.util.Scanner;
import java.lang.Integer;
public class Question7 {

    public static void GenerateException (String text) {
        int num = Integer.parseInt(text);
        System.out.print("Converted Number: " + num);
    }

    public static void HandleException (String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.print("Converted Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.next();

        GenerateException(text);
        HandleException(text);
    }
}
