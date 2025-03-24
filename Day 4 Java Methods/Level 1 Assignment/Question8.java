import java.util.Scanner;
public class Question8 {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = input.nextInt();

        int[] arr = findSmallestAndLargest(n1, n2, n3);
        System.out.print("Smallest = " + arr[0]);
        System.out.print("\nLargest = " + arr[1]);

        input.close();
    }
}
