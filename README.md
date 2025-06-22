Tic-Tac-Toe Game

A console-based implementation of the classic Tic-Tac-Toe game built in Java. This project demonstrates object-oriented programming principles, game logic implementation, and user input validation.
🎮 Features


Interactive Gameplay: Turn-based console interface for two players

Input Validation: Prevents invalid moves and out-of-bounds inputs

Win Detection: Automatic detection of winning combinations (rows, columns, diagonals)

Draw Detection: Recognizes when the board is full with no winner

Clean Code Architecture: Separation of game logic and user interface

Real-time Board Display: Visual representation of the current game state


🚀 Getting Started
Prerequisites

Java Development Kit (JDK) 8 or higher
Java Runtime Environment (JRE)
Command line interface or IDE

Installation & Running

Clone or Download the Files
bash# If using git
git clone https://github.com/yourusername/tic-tac-toe-java.git
cd tic-tac-toe-java

Compile the Java Files
bashjavac TicTacToe.java TicTacToeDriver.java

Run the Game
bashjava TicTacToeDriver


Alternative: IDE Setup

Import both Java files into your preferred IDE
Run the TicTacToeDriver.java file
Follow the console prompts to play

📖 How to Play
Game Rules


The game is played on a 3x3 grid

Player X always goes first

Players take turns placing their marks (X or O) on empty spaces

The first player to get 3 marks in a row (horizontally, vertically, or diagonally) wins

If all 9 spaces are filled without a winner, the game is a draw

Input Format


Enter your move as two numbers: row and column

Both row and column should be between 0, 1, or 2

Example: To place your mark in the center, enter: 1 1


Board Layout

   0   1   2

0  -   -   -

1  -   -   -

2  -   -   -


Sample Gameplay

Welcome to Tic-Tac-Toe!

Current Board:

- - - 

- - - 

- - - 


Player X, enter your move (row and column: 0, 1, or 2): 
1 1


Current Board:

- - - 

- X - 

- - - 


Player O, enter your move (row and column: 0, 1, or 2): 
0 0


Current Board:

O - - 

- X - 

- - -


🏗️ Project Structure

Files Overview

 TicTacToe.java        # Core game logic and board management

 TicTacToeDriver.java  # User interface and game control

Class Architecture

TicTacToe.java - Game Logic


char[][] board: 3x3 array representing the game board

char currentPlayer: Tracks current player ('X' or 'O')


Key Methods:


initializeBoard(): Sets up empty board with '-' characters

printBoard(): Displays current board state

makeMove(int row, int col): Validates and executes player moves

checkWinner(): Determines if current player has won

isBoardFull(): Checks for draw condition

switchPlayer(): Alternates between players



TicTacToeDriver.java - User Interface


Game Loop: Manages turn-based gameplay

Input Handling: Processes user commands and validates input

Game State Management: Controls game flow and end conditions

User Feedback: Provides messages for moves, wins, and draws

🎯 Technical Implementation
Win Condition Algorithm
The game checks for wins in three ways:


Rows: All three cells in any row match current player

Columns: All three cells in any column match current player

Diagonals: Main diagonal (0,0 to 2,2) or anti-diagonal (0,2 to 2,0)

Input Validation


Checks if coordinates are within bounds (0-2)

Verifies target cell is empty ('-' character)

Handles invalid input gracefully with error messages


Game Flow
Start Game → Initialize Board → Player Turn → Validate Move → 
Update Board → Check Win → Check Draw → Switch Player → Repeat

🧪 Testing Scenarios
Test Cases to Try


Horizontal Win: Place 3 X's in the same row
Vertical Win: Place 3 O's in the same column
Diagonal Win: Place 3 X's diagonally
Draw Game: Fill all spaces without 3 in a row
Invalid Moves: Try placing marks on occupied spaces
Out of Bounds: Enter coordinates outside 0-2 range

Expected Behaviors

✅ Invalid moves should be rejected with error message
✅ Game should end immediately when win condition is met
✅ Draw should be declared when board is full
✅ Players should alternate turns properly
✅ Board should update visually after each move

🛠️ Future Enhancements
Potential Improvements

 GUI Version: Implement using Java Swing or JavaFX
 AI Player: Add computer opponent with difficulty levels
 Game Statistics: Track wins, losses, and draws
 Custom Board Sizes: Support for larger grids (4x4, 5x5)
 Multiplayer Network: Online gameplay capability
 Save/Load Games: Persist game state between sessions
 Animated Display: Enhanced visual feedback
 Sound Effects: Audio feedback for moves and wins

Code Improvements

 Exception Handling: More robust error management
 Unit Testing: JUnit test cases for game logic
 Configuration: Customizable player symbols
 Logging: Game history and move tracking
 Input Flexibility: Support for different input formats

🤝 Contributing

Fork the repository
Create a feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request

Contribution Ideas

Implement AI opponent algorithms
Create graphical user interface
Add game statistics and leaderboards
Enhance input validation and error handling
Create unit tests for game logic

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.
👨‍💻 Author
Viktoriia Lavrenchuk

GitHub: VictoriaGraceL
Email: victoriagrace984@gmail.com

🏆 Learning Outcomes
This project demonstrates:

Object-Oriented Design: Clean separation of concerns
Game Logic Implementation: Win detection algorithms
User Input Handling: Validation and error management
Console Interface Design: User-friendly text-based UI
State Management: Tracking game progress and player turns
Java Fundamentals: Arrays, loops, conditionals, and methods


⭐ Star this repository if you enjoyed playing Tic-Tac-Toe!
🎮 Ready to play? Follow the installation steps above and challenge a friend!
