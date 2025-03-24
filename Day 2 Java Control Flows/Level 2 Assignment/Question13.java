import java.util.Scanner;
public class Question13{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between (1-100): ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Multiples of " + num + " below 100 are:");
            int counter = 100;
            while (counter >= 1){
                if (counter % num == 0){
                    System.out.print(counter + " ");
                }
                counter--;
            }
        }
        scanner.close();
    }
}
