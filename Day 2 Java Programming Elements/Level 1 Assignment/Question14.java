import java.util.Scanner;
public class Question14 {
    public static void main(String[] Args ){
        Scanner scanner = new Scanner(System.in);
        float distanceInFeet;
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = scanner.nextFloat();
        float yard = (float) (distanceInFeet / 3);
        float mile = (float) (yard / 1760);
        System.out.printf("The total distance in feet is %.2f while in yard is %.2f and in mile is %.2f.",distanceInFeet , yard, mile);
    }
}