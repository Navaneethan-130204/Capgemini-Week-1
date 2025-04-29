import java.util.Scanner;
public class Question10 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int noc, students;
        System.out.print("Enter the number of chocolates: ");
        noc = scanner.nextInt();
        System.out.print("Enter the number of students: ");
        students = scanner.nextInt();
        int qoc = noc/ students;
        int rem = noc % students;
        System.out.println("The number of chocolates each child gets is " + qoc + " and the number of remaining chocolates are " + rem);
    }
}
