import java.util.Arrays;
import java.util.Scanner;

class Question4 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        return compareArrays(getDigitsArray(num), reverseArray(getDigitsArray(num)));
    }

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\nResults:");
        System.out.println("1. Count of digits: " + countDigits(num));
        System.out.println("2. Digits array: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("3. Reversed array: " + Arrays.toString(reverseArray(getDigitsArray(num))));
        System.out.println("4. Is the number a palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
        System.out.println("5. Is the number a duck number? " + (isDuckNumber(num) ? "Yes" : "No"));

        input.close();
    }
}
