public class TicTacToe {
    private char[][] board;  // 3x3 board represented as a 2D character array
    private char currentPlayer;  // Tracks the current player ('X' or 'O')

    // Constructor to initialize the board and set the starting player
    public TicTacToe() {
        board = new char[3][3];  // Create a 3x3 board
        currentPlayer = 'X';  // 'X' starts the game
        initializeBoard();  // Fill board with default empty value '-'
    }

    // Initializes the board with '-' to represent empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) { // Loop through rows
            for (int j = 0; j < 3; j++) { // Loop through columns
                board[i][j] = '-'; // Set each cell to '-'
            }
        }
    }

    // Prints the current board state in a readable format
    public void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) { // Loop through rows
            for (int j = 0; j < 3; j++) { // Loop through columns
                System.out.print(board[i][j] + " "); // Print each cell followed by a space
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    // Checks if a move is valid and places the player's mark on the board
    public boolean makeMove(int row, int col) {
        // Check if the move is within the board bounds and the cell is empty
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer; // Place the current player's mark
            return true; // Valid move
        }
        return false; // Invalid move
    }

    // Switches the current player from 'X' to 'O' or 'O' to 'X'
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Checks if the current player has won the game
    public boolean checkWinner() {
        // Check all rows and columns for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||  // Row check
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {  // Column check
                return true; // Win detected
            }
        }

        // Check diagonals for a win
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||  // Main diagonal
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {  // Opposite diagonal
            return true; // Win detected
        }

        return false; // No win yet
    }

    // Checks if the board is full, which results in a draw
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) { // Loop through rows
            for (int j = 0; j < 3; j++) { // Loop through columns
                if (board[i][j] == '-') { // If there's an empty space, the game is not a draw
                    return false;
                }
            }
        }
        return true; // If no empty spaces, the game is a draw
    }

    // Returns the current player's symbol ('X' or 'O')
    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
