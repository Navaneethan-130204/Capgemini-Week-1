import java.util.Scanner;
public class Question4 {

    public static double ConvertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double ConvertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double ConvertMetersToFeet(double metre) {
        double metre2feet = 3.28084;
        return metre * metre2feet;
    }

    public static double ConvertFeetToMetre(double feet) {
        double feet2metre = 0.3048;
        return feet * feet2metre;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Km: ");
        double km = input.nextInt();

        System.out.println("Enter the Miles: ");
        double miles = input.nextInt();

        System.out.println("Enter the Metre: ");
        double metre = input.nextInt();

        System.out.println("Enter the Feet: ");
        double feet = input.nextInt();

        double km2mile = ConvertKmToMiles(km);
        double mile2km = ConvertMilesToKm(miles);
        double metre2feet = ConvertMetersToFeet(metre);
        double feet2metre = ConvertFeetToMetre(feet);

        System.out.println(km  + " km = " + km2mile + " mile");
        System.out.println(miles + " miles = " + mile2km + " km");
        System.out.println(metre + " metre = " + metre2feet + " feet");
        System.out.println(feet + " feet = " + feet2metre + " metre");

        input.close();
    }
}
