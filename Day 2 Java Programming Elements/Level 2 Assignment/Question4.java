import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius;
        System.out.println("Enter the temperature in Celsius: ");
        celsius= scanner.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " celsius is equal to " + fahrenheit + " fahrenheit");
    }
}
