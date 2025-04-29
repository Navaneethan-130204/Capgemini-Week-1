import java.util.Scanner;
public class Question5 {

    public static int Number(int num) {
        if (num > 0) {
            return 1;
        }
        else if (num < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int number = Question5.Number(num);
        System.out.println(number);

        input.close();
    }
}
