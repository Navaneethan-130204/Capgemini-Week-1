import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of person: ");
        int num = input.nextInt();
        double[][] personData = new double[num+1][3];
        String[] weightStatus = new String[num+1];
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter the weight of person " + i + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter the height of person " + i + ": ");
            personData[i][1] = input.nextDouble();
            personData[i][1] = personData[i][1]/100;

        }
        for (int i = 1; i <= num; i++) {
            personData[i][2] = (personData[i][0] / (personData[i][1] * personData[i][1]));
        }
        for (int i = 1; i <= num; i++) {
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else if (personData[i][2] >= 40.0) {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15S\n", "Person", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%-15d %-15.2f %-15.2f %-15.2f %-15s\n", (i), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}

