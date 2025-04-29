import java.util.Scanner;
public class Question1 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("It is a leap year.");
                    }
                    else {
                        System.out.println("Not a leap year.");
                    }
                }
                else {
                    System.out.println("It is a leap year.");
                }
            }
            else {
                System.out.println("Not a leap year");
            }
        }
        scanner.close();
    }
}