import java.util.Scanner;
public class Question10{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        int greatestFactor = 1;
        if (num > 0) {
            int i = num -1;
            while (i >= 1) {
                if (num % i == 0) {
                    greatestFactor = i;
                    System.out.println(greatestFactor);
                    break;
                }
                i--;
            }
        }
        scanner.close();
    }
}
