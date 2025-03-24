import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of person: ");
        int num = input.nextInt();
        double[] weight = new double[num+1];
        double[] height = new double[num+1];
        double[] bmi = new double[num+1];
        double[] heightMetre = new double[num+1];
        String[] weightStatus = new String[num+1];
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter the weight of person " + i + ":");
            weight[i] = input.nextDouble();
            System.out.print("Enter the height of person " + i + ":");
            height[i] = input.nextDouble();
            heightMetre[i] = height[i]/100;
        }
        for (int i = 1; i <= num; i++) {
            bmi[i] = (weight[i] / (heightMetre[i] * heightMetre[i]));
        }
        for (int i = 1; i <= num; i++) {
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else if (bmi[i] >= 40.0) {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15S\n", "Person", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("-------------------------------------------------");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%-15d %-15.2f %-15.2f %-15.2f %-15s\n", (i), height[i], weight[i], bmi[i], weightStatus[i]);
        }
        input.close();
    }
}

