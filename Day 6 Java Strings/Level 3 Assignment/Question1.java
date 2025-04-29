import java.util.Arrays;
import java.util.Scanner;
public class Question1 {

    public static double[][] BMIStatus (double[][] inputDetails) {
        double[][] bmi = new double[inputDetails.length][1];
        for (int i = 0; i < inputDetails.length; i++){
            inputDetails[i][1] = inputDetails[i][1] / 100;
            bmi[i][0] = inputDetails[i][0] / (inputDetails[i][1] * inputDetails[i][1]);
        }
        return bmi;
    }

    public static String[][] StoreBMIDetails (double[][] inputDetails, double[][] bmi){
        String[][] result = new String[inputDetails.length][4];

        for (int i = 0; i < inputDetails.length; i++) {
            result[i][0] = String.valueOf(inputDetails[i][1]);
            result[i][1] = String.valueOf(inputDetails[i][0]);
            result[i][2] = String.format("%.2f", bmi[i][0]);
            if (bmi[i][0] <= 18.4) {
                result[i][3] = "UnderWeight";
            }
            else if (bmi[i][0] >= 18.5 && bmi[i][0] <= 24.9) {
                result[i][3] = "Normal";
            }
            else if (bmi[i][0] >= 25.0 && bmi[i][0] <= 39.9) {
                result[i][3] = "OverWeight";
            }
            else {
                result[i][3] = "Obese";
            }
        }
        return result;
    }

    public static void DisplayResult (String[][] bmiDetails) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n" ,"Person", "Weight(Kg)", "Height(m)", "BMI Value", "Status");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < bmiDetails.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s %-15s\n" ,(i+1), bmiDetails[i][1],  bmiDetails[i][0],  bmiDetails[i][2], bmiDetails[i][3]);
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int num = input.nextInt();

        double[][] inputDetails = new double[num][2];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the weight(Kg) of person " + (i+1) + ": ");
            inputDetails[i][0] = input.nextDouble();
            System.out.print("Enter the height(Cm) of person " + (i+1) + ": ");
            inputDetails[i][1] = input.nextDouble();
        }

        double[][] bmiStatus = BMIStatus(inputDetails);
        String[][] storeDetails = StoreBMIDetails(inputDetails, bmiStatus);
        DisplayResult(storeDetails);

        input.close();
    }
}
