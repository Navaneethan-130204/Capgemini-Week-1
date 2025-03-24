import java.util.Scanner;

public class Question12 {

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

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of students: ");
        int num = input.nextInt();

        int[][] pcm = RandomScore(num);
        int[][] details = TotalAveragePercentage(num);

        System.out.println("\nStudents Mark Details:");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Student", "Physics", "Chemistry", "Maths", "Total Mark", "Average", "Percentage");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-10d %-15d %-15d %-15d %-15d %-15d %-15d\n",(i+1), pcm[i][0], pcm[i][1], pcm[i][2], details[i][0], details[i][1], details[i][2]);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");

        input.close();
    }
}
