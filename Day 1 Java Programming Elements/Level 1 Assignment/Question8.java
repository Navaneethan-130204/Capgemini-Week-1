import java.util.Scanner;
public class Question8 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        double km;
        System.out.print("Enter the kilometer: ");
        km = scanner.nextDouble();
        double miles = (double) (km * 0.621371);
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
    }
}
