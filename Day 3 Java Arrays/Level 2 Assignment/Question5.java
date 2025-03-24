import java.util.Arrays;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = num % 10;;
            num /= 10;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
        input.close();
    }
}

