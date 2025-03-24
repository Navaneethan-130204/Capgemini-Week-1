import java.util.Scanner;
public class Question14 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int result = 1, counter = 0;
        if (num > 0) {
            while (counter < power) {
                result *= num;
                counter++;
            }
            System.out.println("The result of base " + num + " and power " + power + " is " + result);
        }
    }
}