import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr[i-1] = num * i;
            System.out.println(num + " * " + i + " = " + arr[i-1]);
        }
        input.close();
    }
}

