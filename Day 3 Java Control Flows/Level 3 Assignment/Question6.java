import java.util.Scanner;
public class Question6 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}