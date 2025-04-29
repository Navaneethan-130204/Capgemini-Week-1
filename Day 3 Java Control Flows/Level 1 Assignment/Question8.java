import java.util.Scanner;
public class Question8{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
        scanner.close();
    }
}
