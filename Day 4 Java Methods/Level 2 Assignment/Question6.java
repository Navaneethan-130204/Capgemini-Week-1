import java.util.Scanner;
public class Question6 {

    public static double ConvertFarhenheitToCelsius(double fah) {
        double fah2cel = (fah - 32) * 5 / 9;
        return fah * fah2cel;
    }

    public static double ConvertCelsiusToFarhenheit(double cel) {
        double cel2fah = (cel * 9 / 5) + 32;
        return cel * cel2fah;
    }

    public static double ConvertPoundsToKilograms(double pounds) {
        double pounds2kg = 0.453592;
        return pounds * pounds2kg;
    }

    public static double ConvertKilogramsToPounds(double kg) {
        double kg2pounds = 2.20462;
        return kg * kg2pounds;
    }

    public static double ConvertGallons2Litres(double gallons) {
        double gal2lit = 3.78541;
        return gallons * gal2lit;
    }

    public static double ConvertLitres2Gallons(double litres) {
        double lit2gal = 0.264172;
        return litres * lit2gal;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit: ");
        double fah = input.nextInt();

        System.out.print("Enter the Celsius: ");
        double cel = input.nextInt();

        System.out.print("Enter the Pounds: ");
        double pounds = input.nextInt();

        System.out.print("Enter the Kilograms: ");
        double kg = input.nextInt();

        System.out.print("Enter the Gallons: ");
        double gal = input.nextInt();

        System.out.print("Enter the Litres: ");
        double lt = input.nextInt();

        double fah2cel = ConvertFarhenheitToCelsius(fah);
        double cel2fah = ConvertCelsiusToFarhenheit(cel);
        double lbs2kg = ConvertPoundsToKilograms(pounds);
        double kg2lbs = ConvertKilogramsToPounds(kg);
        double gal2lt = ConvertGallons2Litres(gal);
        double lt2gal = ConvertLitres2Gallons(lt);

        System.out.println(fah  + " farhenheit = " + fah2cel + " celsius");
        System.out.println(cel + " celsius = " + cel2fah + " farhenheit");
        System.out.println(pounds + " pounds = " + lbs2kg + " kg");
        System.out.println(kg + " kg = " + kg2lbs + " pounds");
        System.out.println(gal + " gallons = " + gal2lt + " litre");
        System.out.println(lt + " litres = " + lt2gal + " gallons");

        input.close();
    }
}
