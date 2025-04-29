import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float far;
        System.out.println("Enter the temperature in Fahrenheit: ");
        far = scanner.nextFloat();
        float celsius = (far - 32) * 5/9;
        System.out.println(far + " fahrenheit is equal to " + celsius + " celsius");
    }
}
