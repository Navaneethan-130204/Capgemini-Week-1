import java.util.Scanner;
public class Question12{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Enter a number greater than zero.");
        }
        else {
            int sumOfFormula = (n * (n + 1)) / 2;
            int sumOfLoop = 0, i = 1;
            while (i <= n) {
                sumOfLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumOfFormula);
            System.out.println("Sum using while loop: " + sumOfLoop);
            if (sumOfLoop == sumOfFormula) {
                System.out.println("BThe sum of the series is using while is " + sumOfLoop + " and using the formulae is " + sumOfFormula + ". So the result is same.");
            }
            else {
                System.out.println("BThe sum of the series is using while is " + sumOfLoop + " and using the formulae is " + sumOfFormula + ". So the result is different.");

            }
        }
        scanner.close();
    }
}
