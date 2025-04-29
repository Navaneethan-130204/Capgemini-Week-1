import java.util.Scanner;
public class Question2 {

    public static int Recursion (int num) {
        int sum = 0;
        if (num < 0) {
            System.exit(0);
        }
        else if (num == 1){
            sum += 1;
        }
        else {
            sum = num + Recursion(num - 1);
        }
        return sum;
    }

    public static int Formula(int num) {
        int sum = 0;
        if (num < 0) {
            System.exit(0);
        }
        else {
            sum = (num * (num + 1)) / 2;
        }
        return sum;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int recursion = Recursion(num);
        int formula = Formula(num);
        System.out.println("Formula: " + formula);
        System.out.println("Recursion Method: " + recursion);
    }
}
