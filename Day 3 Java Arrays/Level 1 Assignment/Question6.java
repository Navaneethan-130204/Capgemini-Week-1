import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        for (int i = 0; i< heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("The mean height of the football team is %.2f", mean);
        input.close();
    }
}

