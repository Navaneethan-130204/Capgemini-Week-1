import java.util.Scanner;
public class Question7 {

    public static boolean StudentVoteChecker (int age) {
        if (age <= 0) {
            return false;
        }
        else {
            if (age >= 18) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the students age: ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            boolean checker = StudentVoteChecker(arr[i]);
            if (checker == true) {
                System.out.println("Student " + (i+1) + " age is " + arr[i] + ", so eligible for voting");
            }
            else {
                System.out.println("Student " + (i+1) + " age is " + arr[i] + ", so not eligible for voting");

            }
        }
        input.close();
    }
}
