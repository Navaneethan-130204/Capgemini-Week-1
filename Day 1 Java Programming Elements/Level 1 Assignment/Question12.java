import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, height;
        System.out.print("Enter the base: ");
        base = scanner.nextInt();
        System.out.print("Enter the height: ");
        height = scanner.nextInt();
        float area = (float) (0.5 * base * height);
        System.out.printf("The area of the triangle is %.2f", area);
    }
}
