import java.util.Scanner;
public class Question7 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in Kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();
        double metre = height / 100;
        double bmi = weight / (metre * metre);
        if (bmi <= 18.4) {
            System.out.println("Your BMI is " + bmi + " and your are Underweight.");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is " + bmi + " and your are Normal.");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Your BMI is " + bmi + " and your are Overweight");
        }
        else {
            System.out.println("Your BMI is " + bmi + " and your are Obese");
        }
        scanner.close();
    }
}