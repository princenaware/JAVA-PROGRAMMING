# 🎮 Memory Game

A classic console-based Memory Card Matching Game implemented in Java! Test your memory skills by finding matching pairs of cards in this engaging puzzle game.

## 📋 Table of Contents
- [About](#about)
- [Features](#features)
- [How to Play](#how-to-play)
- [Prerequisites](#prerequisites)
- [Installation & Running](#installation--running)
- [Game Rules](#game-rules)
- [Code Structure](#code-structure)
- [Java Concepts Used](#java-concepts-used)
- [Contributing](#contributing)
- [License](#license)

## 📖 About
This Memory Game is a simple yet addictive card-matching puzzle where players must find pairs of identical cards by flipping them over two at a time. The game challenges your memory and concentration skills as you try to remember the positions of previously revealed cards.

The game is implemented in pure Java using standard libraries, making it easy to run on any system with Java installed.

## ✨ Features
- 🎯 **Classic Gameplay**: Traditional memory card matching mechanics
- 🔀 **Random Shuffling**: Cards are shuffled each game for replayability
- 📊 **Progress Tracking**: Shows number of pairs found
- 🎮 **Interactive Console**: Simple text-based interface
- 🏆 **Win Condition**: Clear victory message when all pairs are found
- 🔄 **Input Validation**: Prevents invalid moves and flipped card selection
- 📏 **Scalable Design**: Easy to modify for different numbers of pairs

## 🎲 How to Play
1. **Start the Game**: Run the program to begin
2. **View the Board**: See the current state with hidden cards (shown as spaces)
3. **Choose First Card**: Enter the index (0-7) of the first card to flip
4. **Choose Second Card**: Enter the index of the second card to flip
5. **Match Check**: If cards match, they stay revealed; if not, they flip back
6. **Continue**: Repeat until all pairs are found
7. **Victory**: Game ends when all 4 pairs are matched!

## 🛠 Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher
- **Command Line Interface**: Terminal, Command Prompt, or PowerShell

## 🚀 Installation & Running

### Method 1: Direct Execution
1. **Navigate to the project directory**:
   ```bash
   cd "Memory Game"
   ```

2. **Compile the Java file**:
   ```bash
   javac MemoryGame.java
   ```

3. **Run the game**:
   ```bash
   java MemoryGame
   ```

### Method 2: From Parent Directory
1. **Compile from parent directory**:
   ```bash
   javac "Memory Game/MemoryGame.java"
   ```

2. **Run the game**:
   ```bash
   java -cp . "Memory Game.MemoryGame"
   ```

## 📜 Game Rules
- **Objective**: Find all 4 matching pairs of cards
- **Cards**: 8 cards total with 4 different symbols (A, B, C, D) - 2 of each
- **Moves**: Flip 2 cards per turn by entering their indices (0-7)
- **Matching**: If the two cards match, they stay revealed and count as a pair
- **No Match**: If cards don't match, they flip back to hidden after showing both
- **Restrictions**:
  - Cannot flip already revealed cards
  - Must enter valid indices (0-7)
  - Game continues until all pairs are found

## 🏗 Code Structure
```
MemoryGame.java
├── main()                    # Game loop and main logic
├── getCardIndex()           # Input validation for card selection
└── printBoard()             # Display game board
```

### Key Components:
- **Card Management**: Uses ArrayList for dynamic card storage
- **Board Display**: String array for visual representation
- **State Tracking**: Boolean array to track flipped cards
- **Shuffle Logic**: Collections.shuffle() for randomization
- **Input Handling**: Scanner for user input with validation

# 📚 Java Concepts Used

This Memory Game demonstrates several fundamental Java programming concepts:

### 🔧 **Core Java Concepts**
- **Classes and Objects**: The `MemoryGame` class encapsulates the entire game logic
- **Main Method**: Standard program entry point (`public static void main(String[] args)`)
- **Import Statements**: Utilizing Java's standard library classes from `java.util` package

### 📊 **Data Structures & Collections**
- **ArrayList**: Dynamic array used to store and manage game cards
  ```java
  ArrayList<String> cards = new ArrayList<>();
  ```
- **Arrays**: Fixed-size arrays for board display and state tracking
  ```java
  String[] board = new String[cards.size()];
  boolean[] flipped = new boolean[cards.size()];
  ```
- **Collections Framework**: `Collections.shuffle()` for randomizing card positions
  ```java
  Collections.shuffle(cards);
  ```

### 🎮 **Control Structures**
- **While Loops**: Game loop that continues until all pairs are found
  ```java
  while (pairsFound < 4) { /* game logic */ }
  ```
- **If-Else Statements**: Decision making for match validation and game flow
- **Nested Loops**: Input validation with while loops inside game loop

### 🛠 **Methods & Modularity**
- **Static Methods**: Helper methods for code organization
  - `getCardIndex()`: Handles user input validation
  - `printBoard()`: Displays current game state
- **Method Parameters**: Passing arrays and objects between methods
- **Return Values**: Methods return validated indices

### 💬 **Input/Output Operations**
- **Scanner Class**: Reading user input from console
  ```java
  Scanner scanner = new Scanner(System.in);
  int index = scanner.nextInt();
  ```
- **Console Output**: `System.out.println()` for game display and messages

### 🔄 **Program Flow & Logic**
- **Variable Declaration**: Different data types (int, boolean, String)
- **State Management**: Tracking game progress with counters and flags
- **Error Handling**: Input validation to prevent invalid moves
- **Game Loop Pattern**: Continuous loop with exit condition

### 🎯 **Key Learning Points**
- **Memory Management**: Understanding object references vs primitive types
- **Array Manipulation**: Working with both dynamic (ArrayList) and static arrays
- **User Interaction**: Handling console-based input/output
- **Algorithm Implementation**: Game logic and state transitions
- **Code Organization**: Breaking down complex logic into smaller, manageable methods

## 📸 Screenshots
```
Welcome to the Memory Game!
|   |   |   |   |   |   |   |   |
```

### During Gameplay
```
| A |   | B |   |   |   |   |   |
Enter index of second card to flip:
```

### Match Found
```
You found a pair!
| A | A | B |   |   |   |   |   |
```

### Victory
```
Congratulations, you won!
```

## 🤝 Contributing
Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Ideas for Enhancement:
- Add more card types/symbols
- Implement difficulty levels
- Add timer/score system
- Create GUI version
- Add sound effects
- Multiplayer support

## 📄 License
This project is open source and available under the [MIT License](../LICENSE).

---

**🎉 Happy Gaming!** Challenge your memory and see how quickly you can match all the pairs. If you enjoy this game, don't forget to star the repository!