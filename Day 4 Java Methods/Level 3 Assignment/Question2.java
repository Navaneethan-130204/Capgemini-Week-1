import java.util.Scanner;
public class Question2 {

    public static int CountOfDigits (int num){
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] DigitArray (int num) {
        int length = CountOfDigits(num);
        int[] arr = new int[length];
        int index = length - 1;
        while (num > 0) {
            arr[index--] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static boolean DuckNumber (int num) {
        int[] arr = DigitArray(num);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean ArmstrongNumber (int num) {
        int[] digit = DigitArray(num);
        int sum = 0, temp = num;
        for (int digits : digit){
            sum += (int) Math.pow(digits, 3);
        }
        return sum == temp;
    }

    public static int[] LargestNumber (int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digits: arr){
            if(digits > largest) {
                secondLargest = largest;
                largest = digits;
            }
            else if (digits > secondLargest && digits != largest) {
                secondLargest = digits;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] SmallestNumber (int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digits: arr){
            if(digits < smallest) {
                secondSmallest = smallest;
                smallest = digits;
            }
             else if (digits < secondSmallest && digits != smallest) {
                secondSmallest = digits;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int count = CountOfDigits(num);
        int[] store = DigitArray(num);
        System.out.println("Digit count: " + count);

        boolean duckNum = DuckNumber(num);
        boolean armNum = ArmstrongNumber(num);
        if (duckNum) {
            System.out.println("It is not a Duck Number.");
        }
        else {
            System.out.println("It is not a Duck Number.");
        }

        if (armNum) {
            System.out.println("It is an ArmStrong Number.");
        }
        else {
            System.out.println("It is not an ArmStrong Number.");
        }

        int[] largest = LargestNumber(store);
        int[] smallest = SmallestNumber(store);
        System.out.println("largest: " + largest[0]);
        System.out.println("Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0]);
        System.out.println("Second Smallest: " + smallest[1]);

        input.close();
    }
}
