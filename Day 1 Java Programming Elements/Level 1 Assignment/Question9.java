import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee, discountPercentage;
        System.out.print("Enter the fee amount: ");
        fee = scanner.nextInt();
        System.out.print("Enter the discount percentage: ");
        discountPercentage = scanner.nextInt();
        int discountAmt = fee / discountPercentage;
        int actualFee = fee - discountAmt;
        System.out.println("The discount amount is INR " + discountAmt + " and final discounted fee is INR " + actualFee);
    }
}
