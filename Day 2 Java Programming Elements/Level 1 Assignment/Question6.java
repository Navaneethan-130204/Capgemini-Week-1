public class Question6 {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        int discountAmt = fee / discount;
        int actualFee = fee - discountAmt;
        System.out.println("The discount amount is INR " + discountAmt + " and final discounted fee is INR " + actualFee);
    }
}