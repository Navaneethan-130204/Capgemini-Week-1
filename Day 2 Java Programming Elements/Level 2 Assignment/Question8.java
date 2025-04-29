import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the city you will travel via: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter your final destination city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.println("Travel Details for " + name );
        System.out.println("Starting City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Total Distance Traveled: " + totalDistance + " miles");
        System.out.printf("Average Speed: %.2f miles per hour%n", averageSpeed);
    }
}
