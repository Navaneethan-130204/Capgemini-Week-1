import java.util.Scanner;
public class Question15 {
    public static void main(String[] Args ){
        Scanner scanner = new Scanner(System.in);
        float unitPrice, quantity;
        System.out.print("Enter the unit Price: ");
        unitPrice = scanner.nextFloat();
        System.out.print("Enter the Quantity: ");
        quantity = scanner.nextFloat();
        float totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price in INR %.2f, if the quantity %.2f and unit price is INR %.2f.", totalPrice, quantity, unitPrice);
    }
}