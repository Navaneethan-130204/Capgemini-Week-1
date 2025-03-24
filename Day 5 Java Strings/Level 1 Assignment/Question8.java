import java.util.Scanner;
public class Question8 {

    public static void Exception(int[] arr) {
        for (int i = 1; i < arr.length + 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void HandleException (int[] arr) {
        try {
            for (int i = 1; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Exception(arr);
        HandleException(arr);
        input.close();
    }
}
