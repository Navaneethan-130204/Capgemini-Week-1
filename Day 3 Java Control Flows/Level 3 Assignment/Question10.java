import java.util.Scanner;
public class Question10 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double n2 = scanner.nextInt();
        System.out.print("Enter the operand (+, -, *, /): ");
        String op = scanner.next();
        switch (op){
            case "+":
                double add = n1 + n2;
                System.out.println(add);
                break;
            case "-":
                double sub = n1 - n2;
                System.out.println(sub);
                break;
            case "*":
                double mul = n1 * n2;
                System.out.println(mul);
                break;
            case "/":
                double div = n1 / n2;
                System.out.println(div);
                break;
            default:
                System.out.println("Enter a valid operand.");
        }
        scanner.close();
    }
}