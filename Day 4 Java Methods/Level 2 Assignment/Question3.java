import java.util.Scanner;
public class Question3 {

    public static void LeapYearOrNot (int year) {
        if (year < 1582) {
            System.out.println("Enter a valid year above 1582.");
        }
        else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if(year % 400 ==0) {
                        System.out.println("It is a leap year.");
                    }
                    else {
                        System.out.println("It is not a leap year.");
                    }
                }
                else {
                    System.out.println("It is a leap Year.");
                }
            }
            else {
                System.out.println("It is not a leap year.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        LeapYearOrNot(year);
    }
}
