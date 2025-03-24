import java.util.Scanner;
public class Question1 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println((i + " is an even number."));
            }
            else {
                System.out.println(( i + " is an odd number."));

            }
        }
        scanner.close();
    }
}
