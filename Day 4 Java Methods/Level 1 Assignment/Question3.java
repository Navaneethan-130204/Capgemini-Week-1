import java.util.Scanner;
public class Question3 {

    public static int MaximumHandShakes (int number) {
        return (number * (number - 1)) / 2;
    }

    public static void main (String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num = input.nextInt();

        int handShakes = Question3.MaximumHandShakes(num);
        System.out.println("The number of possible handshakes is " + handShakes);

        input.close();
    }
}
