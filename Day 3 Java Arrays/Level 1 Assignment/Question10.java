import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        String[] arr = new String[num+1];
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    arr[i] = "FizzBuzz";
                }
                else if (i % 3 == 0) {
                    arr[i] = "Fizz";
                }
                else if (i % 5 == 0) {
                    arr[i] = "Buzz";
                }
                else {
                    arr[i] = String.valueOf(i);
                }
            }
            for (int i = 1; i <= num; i++) {
                System.out.println("Position " + i + " = " + arr[i]);
            }
        }
        input.close();
    }
}

