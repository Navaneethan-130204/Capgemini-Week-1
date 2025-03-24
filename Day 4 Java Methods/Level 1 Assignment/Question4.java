import java.util.Scanner;
public class Question4 {

    public static float AthleteRounds(int side1, int side2, int side3, float distance) {
        float perimeter = side1 + side2 + side3;
        float rounds = (perimeter / distance);
        return rounds;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for side1: ");
        int side1 = input.nextInt();

        System.out.print("Enter the value for side2: ");
        int side2 = input.nextInt();

        System.out.print("Enter the value for side3: ");
        int side3 = input.nextInt();

        System.out.print("Enter the distance to be covered: ");
         float distance = input.nextInt();

        float rounds = Question4.AthleteRounds(side1, side2, side3, distance);
        System.out.printf("To complete " + distance + " Km run, you need to complete %.2f rounds." , rounds);

        input.close();
    }
}
