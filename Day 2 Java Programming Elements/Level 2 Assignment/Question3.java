import java.util.Scanner;
public class Question3 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        c = scanner.nextDouble();
        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
