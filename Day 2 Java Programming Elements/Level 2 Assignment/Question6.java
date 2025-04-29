import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary, bonus;
        System.out.print("Enter your salary: ");
        salary = scanner.nextInt();
        System.out.print("Enter your bonus: ");
        bonus = scanner.nextInt();
        int totalSalary = salary + bonus;
        System.out.print("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total income is INR " + totalSalary);
    }
}
