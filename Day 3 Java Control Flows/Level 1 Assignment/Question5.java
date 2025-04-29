import java.util.Scanner;
public class Question5{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the your age: ");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("The person age is " + age + " and can vote.");
        }
        else {
            System.out.println("The person age is " + age + " and cannot vote.");        }
        scanner.close();
    }
}
