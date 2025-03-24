import java.util.Scanner;
public class Question7{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
