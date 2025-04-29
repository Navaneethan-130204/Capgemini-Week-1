import java.util.Scanner;
public class Question7 {

    public static int SumOfNumber(int num) {
        int sum = 0;
        if (num >= 0) {
            sum = (num * (num + 1)) / 2;
        }
        return sum;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int number = Question7.SumOfNumber(num);
        System.out.println("The sum of the first " + num + " Natural numbers are " + number);

        input.close();
    }
}
