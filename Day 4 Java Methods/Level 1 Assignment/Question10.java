import java.util.Scanner;
public class Question10 {

    public static int[] findChocolates(int chocolates, int students) {
        int chocolatePerStudent = chocolates / students;
        int remainingChocolate = chocolates % students;
        return new int[]{chocolatePerStudent, remainingChocolate};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolate = input.nextInt();

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        int[] arr = findChocolates(chocolate, students);
        System.out.print("Chocolate per student = " + arr[0]);
        System.out.print("\nRemaining chocolates = " + arr[1]);

        input.close();
    }
}
