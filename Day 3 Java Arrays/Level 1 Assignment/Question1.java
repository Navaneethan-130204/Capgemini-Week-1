import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 18){
                System.out.println("The student with the age " + arr[i] + " can vote.");
            }
            else if (arr[i] < 0) {
                System.out.println("Invalid Age.");
            }
            else {
                System.out.println("The student with the age " + arr[i] + " cannot vote.");
            }
        }
        input.close();
    }
}

