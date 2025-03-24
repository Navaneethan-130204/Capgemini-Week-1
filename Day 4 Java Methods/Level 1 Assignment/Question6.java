import java.util.Scanner;
public class Question6 {

    public static String SpringSeason(int month, int date) {
        boolean isSpring = ((month == 3) && (date >= 20)
                            || (month == 4)
                            || (month == 5)
                            || ((month == 6) && (date <=20)));
        String result;
        if (isSpring) {
            result = "It is a Spring Season.";
        }
        else {
            result = "It is not a Spring Season.";
        }
        return result;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the Date (1-31): ");
        int date = input.nextInt();

        String spring = Question6.SpringSeason(month, date);
        System.out.println(spring);

        input.close();
    }
}
