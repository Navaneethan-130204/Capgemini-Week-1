import java.util.Scanner;

class Question6 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int num) {
        int product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int num) {
        double product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor;
        }
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor;
        }
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor;
        }
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] factors = findFactors(num);
        System.out.print("\n1. Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\n2. Greatest Factor: " + greatestFactor(num));
        System.out.println("3. Sum of Factors: " + sumOfFactors(num));
        System.out.println("4. Product of Factors: " + productOfFactors(num));
        System.out.println("5. Product of Cube of Factors: " + productOfCubeOfFactors(num));
        System.out.println("6. Is Perfect Number? " + (isPerfect(num) ? "Yes" : "No"));
        System.out.println("7. Is Abundant Number? " + (isAbundant(num) ? "Yes" : "No"));
        System.out.println("8. Is Deficient Number? " + (isDeficient(num) ? "Yes" : "No"));
        System.out.println("9. Is Strong Number? " + (isStrong(num) ? "Yes" : "No"));

        input.close();
    }
}
