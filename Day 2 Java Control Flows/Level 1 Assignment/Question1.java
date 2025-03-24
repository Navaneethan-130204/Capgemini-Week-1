import java.util.Scanner;
public class Question1{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 5 == 0) {
            System.out.println("Is the number " + num + " divisible by 5? Yes.");
        }
        else {
            System.out.println("Is the number " + num + " divisible by 5? No.");
        }
        scanner.close();
    }
}
