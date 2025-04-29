import java.util.Scanner;
public class Question8 {

    public static void YoungestFriend(int[] age) {
        if (age[0] < age[1] && age[0] < age[2]) {
            System.out.println("Amar is the youngest of all.");
        }
        else if (age[1] < age[0] && age[1] < age[2]) {
            System.out.println("Akbar is the youngest od all.");
        }
        else {
            System.out.println("Anthony is the youngest of all.");
        }
    }

    public static void TallestFriend(int[] height) {
        if (height[0] > height[1] && height[0] > height[2]) {
            System.out.println("Amar is the tallest of all.");
        }
        else if (height[1] > height[0] && height[1] > height[2]) {
            System.out.println("Akbar is the tallest od all.");
        }
        else {
            System.out.println("Anthony is the tallest of all.");
        }
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int[] height = new int[3];
        int[] age = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            height[i] = input.nextInt();
        }
        YoungestFriend(age);
        TallestFriend(height);

        input.close();
    }
}




