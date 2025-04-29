import java.util.Scanner;
public class Question3{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Is the first number the smallest? Yes.");
            System.out.println("Is the second number the smallest? No.");
            System.out.println("Is the third number the smallest? No.");
        }
        else if ((num2 > num1) && (num2 > num3)){
            System.out.println("Is the first number the smallest? No.");
            System.out.println("Is the second number the smallest? Yes.");
            System.out.println("Is the third number the smallest? No.");
        }
        else {
            System.out.println("Is the first number the smallest? No.");
            System.out.println("Is the second number the smallest? No.");
            System.out.println("Is the third number the smallest? Yes.");
        }
        scanner.close();
    }
}
