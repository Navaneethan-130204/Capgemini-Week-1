import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                if (arr[i] % 2 == 0){
                    System.out.println("The number " + arr[i] + " is positive and even.");
                }
                else {
                    System.out.println("The number " + arr[i] + " is positive and odd.");
                }
            }
            else if (arr[i] < 0) {
                System.out.println("The number " + arr[i] + " is negative.");
            }
            else {
                System.out.println("The number is Zero." );
            }
        }
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and Last numbers are equal.");
        }
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First number is greater than the last number.");
        }
        else {
            System.out.println("Last number is greater than the first number.");
        }
        input.close();
    }
}

