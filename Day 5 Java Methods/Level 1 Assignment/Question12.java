import java.util.Scanner;
public class Question12 {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radian = Math.toRadians(angle);
        double sine = Math.sin(radian);
        double cosine = Math.cos(radian);
        double tangent = Math.tan(radian);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle: ");
        double angle = input.nextInt();

        double[] arr = Question12.calculateTrigonometricFunctions(angle);
        System.out.println("Sine of the angle " + angle + " is " + arr[0]);
        System.out.println("Cosine of the angle " + angle + " is " + arr[1]);
        System.out.println("Tangent of the angle " + angle + " is " + arr[2]);
        input.close();
    }
}
