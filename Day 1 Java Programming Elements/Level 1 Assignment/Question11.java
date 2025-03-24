import java.util.Scanner;
public class Question11 {
    public static void main(String[] Args ){
        Scanner scanner = new Scanner(System.in);
        int var1, var2;
        System.out.print("Enter the variable 1: ");
        var1 = scanner.nextInt();
        System.out.print("Enter the variable 2: ");
        var2 = scanner.nextInt();
        float add = var1 + var2;
        float sub = var1 - var2;
        float mul = var1 * var2;
        float div = (float) var1 / var2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
    }
}