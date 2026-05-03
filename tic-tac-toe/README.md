# Tic Tac Toe Game

## 1. Project Title
**Interactive 3x3 Tic Tac Toe Game in Java**

---

## 2. Project Description

This is a command-line based implementation of the classic Tic Tac Toe game (also known as Noughts and Crosses) in Java. The game is designed for two players where one plays as 'X' and the other as 'O'. The game is played on a 3x3 grid, and the objective is to get three of your marks in a row (horizontally, vertically, or diagonally) to win. The game includes input validation, error handling, and an interactive user interface with a formatted board display.

---

## 3. Tools Used

- **IDE/Editor**: Any Java-compatible IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)
- **Programming Language**: Java
- **Compiler**: Java Compiler (javac)
- **Runtime**: Java Virtual Machine (JVM)
- **Libraries Used**:
  - `java.util.Scanner` - For taking user input
  - `java.util.Arrays` - For array operations
  - `java.util.InputMismatchException` - For exception handling

---

## 4. Concepts Used

### Object-Oriented Programming (OOP) Concepts:
- **Static Methods**: `checkWinner()`, `printBoard()` - Methods that don't require object instantiation
- **Static Variables**: `board`, `turn` - Shared data across the entire program execution

### Core Java Concepts:
- **Arrays**: 1D array to store board state (9 elements representing grid positions)
- **String Operations**: String concatenation, comparison, and manipulation
- **Control Flow**:
  - `while` loop for game continuation
  - `switch` statement for checking winning conditions
  - `if-else` statements for game logic
  - `for` loop for iterating through board positions
- **Exception Handling**: Try-catch block to handle `InputMismatchException` and prevent invalid input errors
- **Conditional Operators**: Ternary operator (`? :`) for turn switching
- **Input/Output**: Scanner class for user input and System.out for output

### Game Development Concepts:
- **Game State Management**: Tracking board state and player turns
- **Win Condition Detection**: Checking all possible winning combinations (8 total)
- **Input Validation**: Range checking and slot availability verification
- **User Feedback**: Real-time board display and status messages

---

## 5. Game Rules

1. **Board**: 3x3 grid with 9 positions numbered 1-9
2. **Players**: Two players (X and O)
3. **Turn Order**: X plays first, then players alternate
4. **Moving**: Players enter slot number (1-9) to place their mark
5. **Winning**: First player to get 3 marks in a row (horizontal, vertical, or diagonal) wins
6. **Draw**: If all 9 slots are filled without a winner, the game is a draw
7. **Invalid Moves**: Cannot place a mark on an already occupied slot

---

## 6. Program Features

- ✅ Interactive command-line interface
- ✅ Formatted 3x3 game board display
- ✅ Alternating player turns (X and O)
- ✅ Input validation and error handling
- ✅ Win detection for all 8 possible winning combinations
- ✅ Draw detection when board is full
- ✅ Prevention of invalid input causing program crash
- ✅ Clear game status messages
- ✅ Real-time board update after each move

---

## 7. How to Compile and Run

### Compilation:
```bash
javac tictactoe.java
```

### Running the Program:
```bash
java tictactoe
```

---

## 8. Sample Output

```
Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X will play first. Enter a slot number to place X in:
5
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | X | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
O's turn; enter a slot number to place O in:
1
|---|---|---|
| O | 2 | 3 |
|-----------|
| 4 | X | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X's turn; enter a slot number to place X in:
9
|---|---|---|
| O | 2 | 3 |
|-----------|
| 4 | X | 6 |
|-----------|
| 7 | 8 | X |
|---|---|---|
O's turn; enter a slot number to place O in:
3
|---|---|---|
| O | 2 | O |
|-----------|
| 4 | X | 6 |
|-----------|
| 7 | 8 | X |
|---|---|---|
X's turn; enter a slot number to place X in:
4
|---|---|---|
| O | 2 | O |
|-----------|
| X | X | 6 |
|-----------|
| 7 | 8 | X |
|---|---|---|
O's turn; enter a slot number to place O in:
7
|---|---|---|
| O | 2 | O |
|-----------|
| X | X | 6 |
|-----------|
| O | 8 | X |
|---|---|---|
Congratulations! O's have won! Thanks for playing.
```

### Example of Invalid Input Handling:

```
X's turn; enter a slot number to place X in:
10
Invalid input; re-enter slot number:
5
(5 is already taken)
Slot already taken; re-enter slot number:
3
```

---

## 9. Code Structure and Explanation

### Global Variables:
```java
static String[] board;    // Stores the current board state
static String turn;       // Tracks whose turn it is (X or O)
```

### Main Methods:

#### `checkWinner()` Method:
- Checks all 8 possible winning combinations (3 rows, 3 columns, 2 diagonals)
- Returns "X" if X wins, "O" if O wins, "draw" if board is full, null if game continues
- Uses switch statement to build strings representing each line

#### `printBoard()` Method:
- Displays the current board state in a formatted 3x3 grid
- Shows position numbers (1-9) or player marks (X/O)
- Called after each move to update the player view

#### `main()` Method:
- Initializes the game board with numbers 1-9
- Contains main game loop that continues until there's a winner or draw
- Handles player input with validation and exception handling
- Manages turn alternation between players
- Calls checkWinner() to determine game state

---

## 10. Algorithm Flow

```
1. Initialize board with positions 1-9
2. Set initial turn to X
3. Display welcome message and initial board
4. WHILE winner is null:
   a. Take player input (slot number)
   b. Validate input range (1-9)
   c. Check if slot is available
   d. If available, place player mark and update board
   e. Toggle turn to other player
   f. Display updated board
   g. Check for winner/draw
   h. If invalid input or taken slot, prompt again
5. Display final result (winner or draw)
6. Close scanner and exit
```

---

## 11. Winning Conditions

The game checks for 8 possible winning combinations:

| Combination | Description |
|-------------|-------------|
| 1-2-3 | Top row |
| 4-5-6 | Middle row |
| 7-8-9 | Bottom row |
| 1-4-7 | Left column |
| 2-5-8 | Middle column |
| 3-6-9 | Right column |
| 1-5-9 | Diagonal (top-left to bottom-right) |
| 3-5-7 | Diagonal (top-right to bottom-left) |

---

## 12. Project Enhancements (Suggested Future Improvements)

- Add difficulty levels (AI opponent)
- Implement a scoring system to track multiple games
- Add game statistics and win/loss records
- Create a GUI version using Java Swing or JavaFX
- Add undo functionality
- Implement minimax algorithm for intelligent opponent
- Add replay feature to save and review games

---

## 13. Conclusion

This Tic Tac Toe game is an excellent project for learning fundamental Java concepts including array manipulation, control flow, input validation, and exception handling. The code demonstrates good programming practices with clear method separation, input validation, and user-friendly feedback.

---

## 14. Author & Date

**Date**: 2026
**Language**: Java
