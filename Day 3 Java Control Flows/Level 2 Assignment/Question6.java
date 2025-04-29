import java.util.Scanner;
public class Question6{
    public static void main (String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Amar Height: ");
        int amarHeight = scanner.nextInt();
        System.out.print("Enter Akbar Height: ");
        int akbarHeight = scanner.nextInt();
        System.out.print("Enter Anthony Height: ");
        int anthonyHeight = scanner.nextInt();
        if ((amarAge < akbarAge) && (amarAge < anthonyAge)) {
            System.out.println("Amar is the youngest of all.");
        }
        else if ((akbarAge < amarAge) && (akbarAge < anthonyAge)) {
            System.out.println("Akbar is the youngest of all.");
        }
        else{
            System.out.println("Anthony is the youngest of all.");
        }
        if ((amarHeight > akbarHeight) && (amarHeight < anthonyHeight)) {
            System.out.println("Amar is the tallest of all.");
        }
        else if ((akbarHeight > amarHeight) && (akbarHeight > anthonyHeight)) {
            System.out.println("Akbar is the tallest of all.");
        }
        else{
            System.out.println("Anthony is the tallest of all.");
        }
        scanner.close();
    }
}
