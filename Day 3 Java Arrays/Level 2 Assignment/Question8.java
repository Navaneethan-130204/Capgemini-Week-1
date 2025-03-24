import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        double [] physics = new double[num+1];
        double [] chemistry = new double[num+1];
        double [] maths = new double[num+1];
        double[] percentage = new double[num+1];
        String[] grade = new String[num+1];
        for(int i = 1; i <= num; i++) {
            System.out.print("Enter the student " + (i+1) + " Physics mark: ");
            physics[i] = input.nextDouble();
            System.out.print("Enter the student " + (i+1) + " Chemistry mark: ");
            chemistry[i] = input.nextDouble();
            System.out.print("Enter the student " + (i+1) + " Maths mark: ");
            maths[i] = input.nextDouble();
        }
        for(int i = 1; i <= num; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
        }
        for (int i = 1; i <= num; i++) {
            if (percentage[i] >= 80) {
                grade[i] = "A";
            }
            else if (percentage[i] >= 70 && percentage[i] <= 79) {
                grade[i] = "B";
            }
            else if (percentage[i] >= 60 && percentage[i] <= 69) {
                grade[i] = "C";
            }
            else if (percentage[i] >= 50 && percentage[i] <= 59) {
                grade[i] = "D";
            }else if (percentage[i] >= 40 && percentage[i] <= 49) {
                grade[i] = "E";
            }
            else {
                grade[i] = "R";
            }
        }
        System.out.println("\nStudents Mark Details:");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f %-10s\n", (i), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
        input.close();
    }
}

