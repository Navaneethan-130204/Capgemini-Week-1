import java.util.Scanner;
public class Question11 {

    public static double calculateWindChill(double temp, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = input.nextInt();

        System.out.print("Enter the Wind Speed: ");
        double windSpeed = input.nextInt();

        double windChill = Question11.calculateWindChill(temp, windSpeed);
        System.out.print("The wind Chill is " + windChill);

        input.close();
    }
}
