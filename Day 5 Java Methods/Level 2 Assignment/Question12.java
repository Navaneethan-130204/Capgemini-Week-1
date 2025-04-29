import java.util.Arrays;
import java.util.Scanner;
public class Question12 {

    public static int[] generate4DigitRandomArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) ((Math.random() * 9000) + 1000);
        }
        
        return arr;
    }

    public static double[] findAverageMinMax(int[] num) {
        double avg = 0.0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            avg += num[i];
            minimum = Math.min(minimum, num[i]);
            maximum = Math.max(maximum, num[i]);
        }
        avg /= num.length;

    return new double[]{avg, minimum, maximum};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = input.nextInt();

        int[] randomNumber = generate4DigitRandomArray(size);
        System.out.println("Random Numbers: " + Arrays.toString(randomNumber));

        double[] results = findAverageMinMax(randomNumber);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);

        input.close();
    }
}
