import java.util.Scanner;
public class Question5 {

    public static double ConvertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double ConvertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double ConvertMetersToInches(double metre) {
        double metre2inches = 39.3701;
        return metre * metre2inches;
    }

    public static double ConvertInchesToMetre(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double ConvertInchesToCm(double inches) {
        double inches2Cm = 2.54;
        return inches * inches2Cm;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Yards: ");
        double yards = input.nextInt();

        System.out.print("Enter the Feet: ");
        double feet = input.nextInt();

        System.out.print("Enter the Metre: ");
        double metre = input.nextInt();

        System.out.print("Enter the Inches: ");
        double inches = input.nextInt();

        double yards2feet = ConvertYardsToFeet(yards);
        double feet2yards = ConvertFeetToYards(feet);
        double metre2inches = ConvertMetersToInches(metre);
        double inches2metre = ConvertInchesToMetre(inches);
        double inches2cm = ConvertInchesToCm(inches);

        System.out.println(yards  + " yards = " + yards2feet + " feet");
        System.out.println(feet + " feet = " + feet2yards + " yards");
        System.out.println(metre + " metre = " + metre2inches + " inches");
        System.out.println(inches + " inches = " + inches2metre + " metre");
        System.out.println(inches + " inches = " + inches2cm + " cm");

        input.close();
    }
}
