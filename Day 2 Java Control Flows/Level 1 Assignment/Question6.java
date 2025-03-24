import java.util.Scanner;
public class Question6{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("The number is a positive number.");
        }
        else if ( num < 0){
            System.out.println("The number is a negative number.");
        }
        else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}
