import java.util.Scanner;
public class Question1 {

    public static int SimpleInterest (int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of Interest: ");
        int rate = input.nextInt();

        System.out.print("Enter the time: ");
        int time = input.nextInt();

        int simpleInterest = Question1.SimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for principal "
                + principal + ", Rate of Interest " + rate + " and Time " + time);

        input.close();

    }
}
