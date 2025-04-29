import java.util.Scanner;
public class Question16 {
    public static void main(String[] Args ){
        Scanner scanner = new Scanner(System.in);
        int students;
        System.out.print("Enter the number of students: ");
        students = scanner.nextInt();
        int handShakes = (students * (students - 1)) / 2;
        System.out.println("The total possible handshakes are " + handShakes);
    }
}