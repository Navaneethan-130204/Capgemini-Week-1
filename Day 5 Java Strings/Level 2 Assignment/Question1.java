import java.util.Scanner;
public class Question1 {

    public static int StringLength (String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(++count);
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
        return count;
    }

    public static boolean Compare(int n1, int n2) {
        if (n1 == n2) {
            return true;
        }
        return false;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.next();
        int manual = StringLength(text);
        int builtin = text.length();
        boolean compare = Compare(manual, builtin);
        System.out.println("Size of string using Manual method: " + manual);
        System.out.println("Size of string using BuiltIn method: " + builtin);
        System.out.println("Both are equal? " + compare);

        input.close();
    }
}
