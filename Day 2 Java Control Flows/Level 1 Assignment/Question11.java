import java.util.Scanner;
public class Question11{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        while (true){
            System.out.print("Enter the number: ");
            double num = scanner.nextDouble();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Total sum is " + sum);
        scanner.close();
    }
}
