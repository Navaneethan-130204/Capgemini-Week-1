import java.util.Scanner;
public class Question2 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year.");
        } else {
            System.out.println("The program only works for years 1582 and above.");
        }
        scanner.close();
    }
}