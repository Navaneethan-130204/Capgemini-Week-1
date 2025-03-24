import java.util.Scanner;
public class Question9 {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int[] arr = findRemainderAndQuotient(num, divisor);
        System.out.print("Quotient = " + arr[0]);
        System.out.print("\nRemainder = " + arr[1]);

        input.close();
    }
}
