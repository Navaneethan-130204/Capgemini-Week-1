import java.util.Scanner;
public class Question7 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the Second number: ");
        b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
