import java.util.Scanner;

public class Question11 {

    public static double[] QuadraticEquation (double a, double b, double c) {
        double delta = (Math.pow(b, 2) - (4 * a * c));
        if (delta > 0.0) {
            double root1 = (-b + Math.sqrt(delta) / (2 * a));
            double root2 = (-b - Math.sqrt(delta) / (2 * a));
            return new double[]{root1,root2};
        }
        else if (delta == 0.0) {
            double root = ((double) -b / (2 * a));
            return new double[]{root};
        }
        else {
            return new double[]{};
        }
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double[] roots = QuadraticEquation(a, b, c);
        if (roots.length == 2) {
            System.out.println("Roots of the equation: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root of the equation: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        input.close();
    }
}



