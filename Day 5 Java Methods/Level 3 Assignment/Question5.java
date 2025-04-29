import java.util.Scanner;

class Question5 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\nResults:");
        System.out.println("1. Is the number prime? " + (isPrime(num) ? "Yes" : "No"));
        System.out.println("2. Is the number neon? " + (isNeon(num) ? "Yes" : "No"));
        System.out.println("3. Is the number spy? " + (isSpy(num) ? "Yes" : "No"));
        System.out.println("4. Is the number automorphic? " + (isAutomorphic(num) ? "Yes" : "No"));
        System.out.println("5. Is the number buzz? " + (isBuzz(num) ? "Yes" : "No"));

        input.close();
    }
}
