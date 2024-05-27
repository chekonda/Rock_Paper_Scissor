import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move (rock, paper, scissors): ");
        String playerMove = scanner.nextLine();
        int computerMoveIndex = (int) (Math.random() * 3);
        String computerMove = "";
        switch (computerMoveIndex) {
            case 0:
                computerMove = "rock";
                break;
            case 1:
                computerMove = "paper";
                break;
            case 2:
                computerMove = "scissors";
                break;
        }
        String winner = "";
        if (playerMove.equals(computerMove)) {
            winner = "Tie";
        } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
                playerMove.equals("scissors") && computerMove.equals("paper") ||
                playerMove.equals("paper") && computerMove.equals("rock")) {
            winner = "Hurray! You won the Match";
        } else {
            winner = "Sorry!Computer Had won the Match";
        }
        System.out.println("Player move: " + playerMove);
        System.out.println("Computer move: " + computerMove);
        System.out.println("Winner: " + winner);
    }
}
