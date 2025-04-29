import java.util.Scanner;
public class Question11{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between (1-100): ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Multiples of " + num + " below 100 are:");
            for (int i = 100; i >= 1; i--){
                if (i % num == 0){
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
