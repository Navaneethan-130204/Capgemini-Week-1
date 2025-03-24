import java.util.Scanner;
public class Question17{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter the year of servicement: ");
        int year = scanner.nextInt();
        if (year > 5) {
            int bonus = (int) (salary * 0.05);
            int grossSalary = salary + bonus;
            System.out.println("Salary: " + salary);
            System.out.println("Bonus amount: " + bonus);
            System.out.println("Total Amount: " + grossSalary);
        }
        scanner.close();
    }
}
