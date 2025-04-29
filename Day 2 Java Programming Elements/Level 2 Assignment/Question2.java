import java.util.Scanner;
public class Question2 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
