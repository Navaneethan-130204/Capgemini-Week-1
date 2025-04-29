import javax.print.DocFlavor;
import java.sql.ResultSet;
import java.util.Scanner;

public class Question10 {

    public static int[][] RandomScore (int num){
        int[][] pcm = new int[num][3];
        for (int i = 0; i < num; i++){
            pcm[i][0] = (int) (Math.random() * 100);
            pcm[i][1] = (int) (Math.random() * 100);
            pcm[i][2] = (int) (Math.random() * 100);
        }
        return pcm;
    }

    public static int[][] TotalAveragePercentage(int num) {
        int[][] score = RandomScore(num);
        int[][] details = new int[score.length][3];
        for (int i = 0; i < num; i++) {
            details[i][0] += score[i][0] + score[i][1] + score[i][2];
        }
        for (int i = 0; i < num; i++) {
            details[i][1] = Math.round((float) details[i][0] / 3);
        }
        for (int i = 0; i < num; i++) {
            details[i][2] = Math.round(((float) details[i][0] / 300) * 100);
        }
        return details;
    }

    public static String[][] Grade(int[][] percentage) {
        String[][] grade = new String[percentage.length][1];

        for (int i = 0; i < percentage.length; i++) {
            int per = percentage[i][2];
            if (per >= 80) {
                grade[i][0] = "Grade A";
            }
            else if (per >= 70 && per <= 79) {
                grade[i][0] = "Grade B";
            }
            else if (per >= 60 && per <= 69) {
                grade[i][0] = "Grade C";
            }
            else if (per >= 50 && per <= 59) {
                grade[i][0] = "Grade D";
            }
            else if (per >= 40 && per <= 49) {
                grade[i][0] = "Grade E";
            }
            else {
                grade[i][0] = "Grade R";
            }
        }
        return grade;
    }

    public static void DisplayResult (int[][] score, int[][]tvp, String[][] grade){
        System.out.println("\nStudents Mark Details:");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Student", "Physics", "Chemistry", "Maths", "Total Mark", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%-10d %-15d %-15d %-15d %-15d %-15d %-15d %-15s\n",(i+1), score[i][0], score[i][1], score[i][2], tvp[i][0], tvp[i][1], tvp[i][2], grade[i][0]);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of students: ");
        int num = input.nextInt();

        int[][] pcm = RandomScore(num);
        int[][] details = TotalAveragePercentage(num);

        String[][] grade = Grade(details);
        DisplayResult(pcm, details, grade);

        input.close();
    }
}
