import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int[] evenNumber = new int[num / 2 + 1];
        int[] oddNumber = new int[num / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        if (num < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }
        else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    evenNumber[evenIndex++] = i;
                }
                else {
                    oddNumber[oddIndex++] = i;
                }
            }
        }
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumber[i] + " ");
        }
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumber[i] + " ");
        }
        input.close();
    }
}

