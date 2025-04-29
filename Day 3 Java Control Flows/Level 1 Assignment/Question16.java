import java.util.Scanner;
public class Question16{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++){
                if (i % 2 == 0) {
                    System.out.println(i + " Even number.");
                }
                else {
                    System.out.println(i + " Odd number.");
                }
            }
        }
        scanner.close();
    }
}
