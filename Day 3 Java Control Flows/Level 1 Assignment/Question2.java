import java.util.Scanner;
public class Question2{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("Is the first number the smallest? Yes.");
        }
        else {
            System.out.println("Is the first number the smallest? No.");
        }
        scanner.close();
    }
}
