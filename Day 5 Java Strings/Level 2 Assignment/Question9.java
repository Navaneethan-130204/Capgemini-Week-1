import java.util.Locale;
import java.util.Scanner;
public class Question9 {

    public static String ComputerChoice (){
        int result = (int) (Math.random() * 3);
        if(result == 0) {
            return "rock";
        }
        else if (result == 1) {
            return "paper";
        }
        else {
            return  "scissors";
        }
    }

    public static String UserChoice () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rock, paper or scissors: ");
        String choice = input.nextLine().toLowerCase();
        String userChoice = choice.toLowerCase();
        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            return choice;
        }
        else {
            System.out.println("Enter a valid choice.");
            return UserChoice();
        }
    }

    public static String FindWinner (String userChoice, String computerChoice) {
        if (userChoice.equals("rock") && computerChoice.equals("scissors")
                || userChoice.equals("paper") && computerChoice.equals("rock")
                || userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "User";
        }
        else if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        else {
            return "Computer";
        }
    }

    public static void StoreResults (String winner, int[] scores) {
        if (winner.equals("User")) {
            scores[0]++;
        }
        else if (winner.equals("Computer")) {
            scores[1]++;
        }
        else {
            scores[2]++;
        }
    }

    public static void DisplayResult(int[] scores, int totalGames){
        System.out.println("\nGame Results:");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-10s\n", "Category", "Count");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-10d\n", "User Wins", scores[0]);
        System.out.printf("%-15s %-10d\n", "Computer Wins", scores[1]);
        System.out.printf("%-15s %-10d\n", "Draws", scores[2]);
        System.out.println("--------------------------------");

        double userWinPercentage = ((double) scores[0] / totalGames) * 100;
        double computerWinPercentage = ((double) scores[1] / totalGames) * 100;

        System.out.println("\nWinning Percentages:");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-10.2f%%\n", "User", userWinPercentage);
        System.out.printf("%-15s %-10.2f%%\n", "Computer", computerWinPercentage);
        System.out.println("--------------------------------");
    }

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rounds you want to play: ");
        int totalRounds = scanner.nextInt();

        int[] scores = {0, 0, 0};

        for (int i = 0; i < totalRounds; i++) {
            System.out.println("\nRound " + (i + 1) + " ----------------");
            String user = UserChoice();
            String computer = ComputerChoice();

            System.out.println("User choice: " + user);
            System.out.println("Computer choice: " + computer);

            String winner = FindWinner(user, computer);
            System.out.println("Winner: " + winner);

            StoreResults(winner, scores);
        }

        DisplayResult(scores, totalRounds);

        scanner.close();
    }
}
