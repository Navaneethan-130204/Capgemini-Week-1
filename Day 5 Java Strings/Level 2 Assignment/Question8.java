import java.util.Arrays;
import java.util.Scanner;
public class Question8 {

    public static int[] RandomAgeOfStudents (int num) {
        int[] age = new int[num];
        for (int i = 0; i < num; i++) {
            age[i] = (int)(Math.random() * 100);
        }
        return age;
    }

    public static String[][] ElgibilityCheck (int[] age) {
        String[][] result = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            result[i][0] = String.valueOf(age[i]);
            if (age[i] > 0 && age[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void DisplayResult (String[][] age) {
        System.out.println("-------------------------");
        System.out.printf("%-15s %-10s\n", "Student Age" , "Can Vote?");
        System.out.println("-------------------------");
        for (int i = 0; i < age.length; i++) {
            System.out.printf("%-15s %-10s\n", age[i][0], age[i][1]);
        }
        System.out.println("-------------------------");
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();

        int[] randomAge = RandomAgeOfStudents(num);
        System.out.println("The students age are: " + Arrays.toString(randomAge));

        String[][] checking = ElgibilityCheck(randomAge);
        DisplayResult(checking);
    }
}
