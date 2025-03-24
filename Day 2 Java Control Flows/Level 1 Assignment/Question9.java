import java.util.Scanner;
public class Question9{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        for (int i = num; i >= 0; i--){
            System.out.println(i);
        }
        scanner.close();
    }
}
