import java.util.Scanner; // Import Scanner for user input

public class TicTacToeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        TicTacToe game = new TicTacToe(); // Create a new instance of the TicTacToe game

        System.out.println("Welcome to Tic-Tac-Toe!");
        game.printBoard(); // Display the initial empty board

        boolean gameRunning = true; // Flag to control the game loop

        while (gameRunning) {
            // Prompt the current player to enter their move
            System.out.println("Player " + game.getCurrentPlayer() + ", enter your move (row and column: 0, 1, or 2): ");
            int row = scanner.nextInt(); // Read row input
            int col = scanner.nextInt(); // Read column input

            // Attempt to place the player's move on the board
            if (game.makeMove(row, col)) {
                game.printBoard(); // Print the updated board after the move

                // Check if the current player has won
                if (game.checkWinner()) {
                    System.out.println("Player " + game.getCurrentPlayer() + " wins!"); // Declare winner
                    gameRunning = false; // End the game loop
                }
                // Check if the board is full (i.e., a draw)
                else if (game.isBoardFull()) {
                    System.out.println("It's a draw!"); // Declare a tie
                    gameRunning = false; // End the game loop
                }
                // If no winner and board is not full, switch turns
                else {
                    game.switchPlayer(); // Switch to the other player
                }
            }
            // If the move was invalid (e.g., space is already occupied)
            else {
                System.out.println("Invalid move, try again."); // Ask for a valid move
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
        System.out.println("Game Over. Thanks for playing!"); // End message
    }
}
