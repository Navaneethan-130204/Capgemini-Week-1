import java.util.Scanner;
public class Question9 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            System.out.println("It is a Abundant Number.");
        }
        else {
            System.out.println("It is not a Abudant Number.");
        }
        scanner.close();
    }
}