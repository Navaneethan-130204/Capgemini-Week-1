import java.util.Scanner;
public class Question1 {

    public static int[] ArrayFactors (int num) {
        int count = 0;
        for (int i = 1; i <= num ; i ++) {
            count++;
        }

        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                arr[index++] = i;
            }
        }
        return arr;
    }

    public static int SumOfFactors (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int ProductOfFactors (int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                continue;
            }
            else {
                product *= arr[i];
            }
        }
        return product;
    }

    public static int SquareOfFactors (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.pow(arr[i], 2);
        }
        return sum;
    }

    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int[] factors = ArrayFactors(num);
        System.out.print("Factors of " + num + ": ");
        for (int i = 0; i < factors.length; i++) {
            if(factors[i] == 0) {
                continue;
            }
            else{
                System.out.print(factors[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of factors: " + SumOfFactors(factors));
        System.out.println("Product of factors: " + ProductOfFactors(factors));
        System.out.println("Sum of squares of factors: " + SquareOfFactors(factors));

        input.close();
    }
}
