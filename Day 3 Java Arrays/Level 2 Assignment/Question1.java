import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0.0 , totalOldSalary = 0.0 , totalNewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter the salary for the Employee " + (i + 1) + ":");
                salary[i] = input.nextDouble();
                System.out.print("Enter years of service for Employee " + (i + 1) + ": ");
                service[i] = input.nextDouble();
                if (service[i] > 0 && salary[i] > 0){
                    break;
                }
                else {
                    System.out.println("Error: Invalid input. Salary must be positive and years of service cannot be negative. Try again.");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Salary Details:");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", (i + 1), salary[i], bonus[i], newSalary[i]);
        }
        System.out.println("\nTotal Payout Summary:");
        System.out.println("-----------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        input.close();
    }
}

