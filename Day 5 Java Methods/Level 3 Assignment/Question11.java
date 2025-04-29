import java.util.Scanner;

class Question11 {

    public static int[][] SalaryAndService (int num){
        int[][] employeeDetails = new int[num][2];
        for (int i = 0; i < num; i++) {
            employeeDetails[i][0] = (int) (Math.random() * 90000 + 10000);
            employeeDetails[i][1] = (int) (Math.random() * 25);
        }
        return employeeDetails;
    }

    public static int[][] NewSalaryAndBonus (int[][] oldDetails) {
        int num = oldDetails.length;
        int[][] salaryAndBonus = new int[num][2];

        for(int i = 0; i < num; i++) {
            int salary = oldDetails[i][0];
            int service = oldDetails[i][1];

            int bonus= (service >= 5) ? (int) (salary * 0.05) : (int) (salary * 0.02);
            int totalSalary = salary + bonus;

            salaryAndBonus[i][0] = bonus;
            salaryAndBonus[i][1] = totalSalary;
        }
        return salaryAndBonus;
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int num = input.nextInt();

        int[][] oldDetails = SalaryAndService(num);
        int[][] newDetails = NewSalaryAndBonus(oldDetails);

        System.out.println("\nEmployee Salary Details:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-15s %-15s\n", "Employee", "Old Salary", "Year of Service", "Bonus", "Total Salary");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-10d %-15d %-20d %-15d %-15d\n",(i+1), oldDetails[i][0], oldDetails[i][1], newDetails[i][0], newDetails[i][1]);
        }
        System.out.println("------------------------------------------------------------------------------");

        input.close();
    }
}
