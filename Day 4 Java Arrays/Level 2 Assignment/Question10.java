import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();
        int[] frequencyArr = new int[10];
        while (num > 0) {
            int digit = (int) (num % 10);
            frequencyArr[digit]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if(frequencyArr[i] > 0) {
                System.out.println("Frequency of " + i + " is " + frequencyArr[i]);
            }
        }
        input.close();
    }
}

