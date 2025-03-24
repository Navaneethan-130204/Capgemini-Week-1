import java.util.Scanner;
public class Question10 {

    public static void CalculateBMI (double[][] arr) {

        for(int i = 0; i < arr.length; i++) {
            arr[i][1] /= 100;
            arr[i][2] = arr[i][0] / (arr[i][1] * arr[i][1]);
        }
        String[] weightStatus = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i][2] <= 18.4) {
                weightStatus[i] = "UnderWeight";
            }
            else if (arr[i][2] >= 18.5 && arr[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (arr[i][2] >= 25.0 && arr[i][2] <= 39.9) {
                weightStatus[i] = "OverWeight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Person", "Weight(kg)", "Height(M)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------------------");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15s\n", (i+1), arr[i][0], arr[i][1], arr[i][2], weightStatus[i]);
        }

    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Person: ");
        int num = input.nextInt();

        double[][] arr = new double[num][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the weight of person " + (i+1) + ": ");
            arr[i][0] = input.nextDouble();
            System.out.print("Enter the height of person " + (i+1) + ": ");
            arr[i][1] = input.nextDouble();
        }

        CalculateBMI(arr);

        input.close();
    }
}
