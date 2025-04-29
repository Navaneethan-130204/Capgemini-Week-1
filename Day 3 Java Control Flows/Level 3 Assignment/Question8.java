import java.util.Scanner;
public class Question8 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0){
            sum += temp % 10;
            temp /= 10;
            }
        if (num % sum == 0) {
            System.out.println("The number is a Harshad Number.");
        }
        else {
            System.out.println("The number is not a Harshad Number.");
        }
        scanner.close();
    }
}