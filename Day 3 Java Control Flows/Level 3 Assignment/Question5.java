import java.util.Scanner;
public class Question5 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int orginialNumber = num;
        while (orginialNumber != 0) {
            int n = orginialNumber % 10;
            int power = (int) Math.pow(n,3);
            sum += power;
            orginialNumber /= 10;
        }
        if (num == sum) {
            System.out.println("It is a Armstrong number.");
        }
        else {
            System.out.println("It is not a Armstrong number.");
        }
        scanner.close();
    }
}