import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double sum = 0.0;
        double[] arr = new double[10];
        int index = 0;
        while (true) {
            double num = input.nextInt();
            if (num <= 0) {
                break;
            }
            else {
                for (int i  = 0; i < 10; i++) {
                    arr[i] = num;
                }
            }
            index++;
            if (index == 10){
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("The total sum is " + sum);
        input.close();
    }
}

