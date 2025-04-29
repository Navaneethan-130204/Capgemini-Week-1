import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        System.out.print("Enter the your height: ");
        height = scanner.nextDouble();
        double inch = (height / 2.54);
        double feet = (inch / 12);
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f.", height, feet, inch);
    }
}
