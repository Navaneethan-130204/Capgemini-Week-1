import java.util.Scanner;
public class Question4{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        if (num >= 0) {
            for (int i = 1; i <= num; i++){
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0){
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
