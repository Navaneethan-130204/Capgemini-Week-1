import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int friends = 3;
        double[] height = new double[friends];
        int[] age = new int[friends];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < friends; i ++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            height[i] = input.nextDouble();
        }
        int minAge = age[0];
        String youngest = names[0];
        double maxHeight = height[0];
        String tallest = names[0];
        for (int i = 0; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                youngest = names[i];
            }
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                tallest = names[i];
            }
        }
        System.out.println("\nYoungest Friend: " + youngest + " (Age: " + minAge + " years)");
        System.out.println("Tallest Friend: " + tallest + " (Height: " + maxHeight + " cm)");
        input.close();
    }
}

