import java.util.Scanner;
public class Question9 {

    public static void PositiveOrNegative (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) {
                System.out.println(arr[i] + " is a positive number.");
            }
            else {
                System.out.println(arr[i] + " is a negative number.");
            }
        }
    }

    public static void OddOrEven (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (arr[i] % 2 == 0){
                    System.out.println(arr[i] + " is a even number.");
                }
                else {
                    System.out.println(arr[i] + " is a odd number.");
                }
            }
        }
    }

     public static int CompareNumbers (int[] arr) {
        if(arr[0] == arr[arr.length-1]) {
            return 0;
        }
        else if (arr[0] > arr[arr.length-1]) {
            return 1;
        }
        else {
            return -1;
        }
     }

     public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the number " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        PositiveOrNegative(arr);

        OddOrEven(arr);

        int compare = CompareNumbers(arr);

        if(compare == 0) {
            System.out.println("Both the numbers are equal.");
        }
        else if (compare == 1) {
            System.out.println("First number is greater than last number.");
        }
        else {
            System.out.println("Last number is greater than first number.");
        }

        input.close();
     }
}
