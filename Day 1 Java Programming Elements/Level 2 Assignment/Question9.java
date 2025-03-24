import java.util.Scanner;
public class Question9 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int side1, side2, side3, distance;
        System.out.print("Enter the value of side1: ");
        side1 = scanner.nextInt();
        System.out.print("Enter the value of side2: ");
        side2 = scanner.nextInt();
        System.out.print("Enter the value of side3: ");
        side3 = scanner.nextInt();
        System.out.print("Enter the distance to be covered: ");
        distance = scanner.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = distance/perimeter;
        System.out.printf("The total number of rounds the athlete will run is " + rounds + " to complete " + distance + " km");
    }
}
