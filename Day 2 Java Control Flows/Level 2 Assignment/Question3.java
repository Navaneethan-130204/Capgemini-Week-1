import java.util.Scanner;
public class Question3{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        for (int i = 6; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
