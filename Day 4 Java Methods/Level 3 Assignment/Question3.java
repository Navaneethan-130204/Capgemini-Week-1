import java.io.DataInput;
import java.util.Scanner;
public class Question3 {

    public static int CountDigits (int num) {
        return String.valueOf(num).length();
    }

    public static int[] StoreDigits (int num) {
        int length = CountDigits(num);
        int[] arr = new int[length];
        int count = 0;
        while (num > 0) {
            arr[count++] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static int SumOfDigits (int num) {
        int[] digits = StoreDigits(num);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int SumOfSquares (int num) {
        int[] digits = StoreDigits(num);
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit,2);
        }
        return sum;
    }

    public static boolean HarshadNumber (int num) {
        int[] digit = StoreDigits(num);
        int sum = 0;
        for(int digits : digit) {
            sum += digits;
        }
        if (num % sum == 0){
            return true;
        }
        return false;
    }

    public static int[][] FrequencyOfNumber (int num) {
        int[] freq = new int[CountDigits(num)];
        int[] digits = StoreDigits(num);

        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] freqArray = new int[digits.length][2];
        for(int i = 0; i < digits.length; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = freq[i];
        }
        return freqArray;
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int count = CountDigits(num);
        System.out.println("Count of the digit: " + count);

        int[] store = StoreDigits(num);
        for (int digit : store) {
            System.out.print(digit + " ");
        }

        int sum = SumOfDigits(num);
        System.out.println("\nSum of Digits: " + sum);

        int square = SumOfSquares(num);
        System.out.println("Sum of Squares of Digits: " + square);

        boolean harshad = HarshadNumber(num);
        if(harshad) {
            System.out.println(num + " is a Harshad Number.");
        }
        else {
            System.out.println(num + " is not a Harshad Number.");
        }

        int[][] frequency = FrequencyOfNumber(num);
        System.out.println("Digit | Frequency");
        for (int i = 0; i < store.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "   |    " + frequency[i][1]);
            }
        }

        input.close();
    }
}
