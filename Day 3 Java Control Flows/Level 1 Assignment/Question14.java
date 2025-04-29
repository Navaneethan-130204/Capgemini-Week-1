import java.util.Scanner;
public class Question14{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("The factorial of the given number is " + fact);
        }
        scanner.close();
    }
}
