import java.util.Scanner;
public class Question2 {

    public static int MaximumHandShakes (int number) {
        return (number * (number - 1)) / 2;
    }

    public static void main (String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num = input.nextInt();

        int handShakes = Question2.MaximumHandShakes(num);
        System.out.println("The number of possible handshakes is " + handShakes);

        input.close();
    }
}
