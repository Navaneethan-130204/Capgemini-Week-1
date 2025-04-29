import java.util.Scanner;
public class Question4 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");

        }
        scanner.close();
    }
}