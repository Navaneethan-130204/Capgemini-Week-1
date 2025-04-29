import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight;
        System.out.print("Enter your weight: ");
        weight = scanner.nextInt();
        float kg = (float) (weight / 2.2);
        System.out.println("The weight of the person in pound is " + weight + " in kg is " + kg );
    }
}
