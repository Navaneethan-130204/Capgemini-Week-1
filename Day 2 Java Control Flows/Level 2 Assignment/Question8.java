import java.util.Scanner;
public class Question8{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            int i = 1;
            while (i <= num){
                if (num % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        scanner.close();
    }
}
