import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal, rate, time;
        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextInt();
        System.out.print("Enter the rate of interest: ");
        rate = scanner.nextInt();
        System.out.print("Enter the time: ");
        time = scanner.nextInt();
        float SI = (float) (principal * rate * time) / 100;
        System.out.println("The Simple Interest is  " + SI + " for the principal " + principal + ". Rate of interest " + rate + " and time " + time);
    }
}
