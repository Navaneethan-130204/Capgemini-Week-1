import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int[] mulResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            mulResult[i-6] = num * i;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        input.close();
    }
}

