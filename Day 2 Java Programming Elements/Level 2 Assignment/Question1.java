import java.util.Scanner;
public class Question1 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        float n1, n2;
        System.out.print("Enter the first number: ");
        n1 = scanner.nextInt();
        System.out.print("Enter the Second number: ");
        n2 = scanner.nextInt();
        int quotient = (int) (n1 / n2);
        float remainder = (float) n1 % n2;
        System.out.printf("The quotient is " + quotient + " and Remainder is %.2f of two number %.2f and %.2f.", remainder, n1, n2);
    }
}
