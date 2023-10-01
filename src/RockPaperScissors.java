import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Rock, Paper, Scissors Game");
            char playerAChoice = getValidChoice("Player A, enter your choice (R/P/S): ");
            char playerBChoice = getValidChoice("Player B, enter your choice (R/P/S): ");

            System.out.println("Player A chose " + playerAChoice);
            System.out.println("Player B chose " + playerBChoice);

            String result = determineWinner(playerAChoice, playerBChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (Y/N): ");
            char playAgain = scanner.next().charAt(0);
            if (playAgain != 'Y' && playAgain != 'y') {
                break;
            }
        }
    }

    private static char getValidChoice(String prompt) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        while (true) {
            System.out.print(prompt);
            choice = scanner.next().toLowerCase().charAt(0);
            if (choice == 'r' || choice == 'p' || choice == 's') {
                return choice;
            } else {
                System.out.println("Invalid choice. Please enter R, P, or S.");
            }
        }
    }

    private static String determineWinner(char playerA, char playerB) {
        if (playerA == playerB) {
            return "It's a Tie!";
        } else if ((playerA == 'r' && playerB == 's') ||
                (playerA == 'p' && playerB == 'r') ||
                (playerA == 's' && playerB == 'p')) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}