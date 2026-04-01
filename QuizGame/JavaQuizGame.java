package QuizGame;
import java.util.Scanner;

/**
 * Java Quiz Game - A console-based quiz application that tests knowledge of Java programming concepts.
 * Features include multiple-choice questions, scoring, high score tracking, and replay functionality.
 */
public class JavaQuizGame {

    // Static variable to track the highest score achieved across all quiz attempts
    static int highScore = 0;

    /**
     * Main method - Entry point of the program.
     * Displays the main menu and handles user choices for starting quiz, viewing rules, or exiting.
     */
    public static void main(String[] args) {

        // Create a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Infinite loop to keep the menu running until user chooses to exit
        while (true) {

            // Display the main menu with options
            System.out.println("\n================================");
            System.out.println("         JAVA QUIZ GAME");
            System.out.println("================================");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Rules");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Handle user choice using if-else statements
            if (choice == 1) {
                startQuiz(sc);
            }
            else if (choice == 2) {
                showRules();
            }
            else if (choice == 3) {
                System.out.println("Thank you for playing!");
                break; // Exit the loop and end the program
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        // Close the scanner to free up resources
        sc.close();
    }

    /**
     * Displays the rules of the quiz game to the user.
     * Shows scoring system, number of questions, and input format.
     */
    public static void showRules() {

        System.out.println("\n------ QUIZ RULES ------");
        System.out.println("1. Total 10 Questions");
        System.out.println("2. Each correct answer = 1 mark");
        System.out.println("3. No negative marking");
        System.out.println("4. Enter option A/B/C/D");
        System.out.println("------------------------");
    }

    /**
     * Starts and conducts the quiz by presenting questions, collecting answers,
     * calculating score, and displaying results. Also handles replay functionality.
     * @param sc Scanner object for reading user input
     */
    public static void startQuiz(Scanner sc) {

        // Initialize score counter for this quiz attempt
        int score = 0;

        // Array containing all quiz questions
        String questions[] = {
                "Who developed Java?",
                "Which keyword is used for inheritance in Java?",
                "Which method is entry point of Java program?",
                "Java is platform independent because of?",
                "Which company owns Java now?",
                "Which keyword creates an object?",
                "Which is not primitive datatype?",
                "Which loop runs at least once?",
                "Which symbol ends a statement?",
                "Which package contains Scanner class?"
        };

        // 2D array containing options for each question (A, B, C, D)
        String options[][] = {
                {"A. James Gosling","B. Dennis Ritchie","C. Guido van Rossum","D. Bjarne Stroustrup"},
                {"A. implement","B. extends","C. inherit","D. using"},
                {"A. start()","B. main()","C. run()","D. init()"},
                {"A. JVM","B. OS","C. Hardware","D. Compiler"},
                {"A. Microsoft","B. IBM","C. Oracle","D. Google"},
                {"A. make","B. new","C. object","D. create"},
                {"A. int","B. float","C. boolean","D. String"},
                {"A. for","B. while","C. do-while","D. foreach"},
                {"A. :","B. ;","C. .","D. #"},
                {"A. java.io","B. java.util","C. java.lang","D. java.awt"}
        };

        // Array containing the correct answers for each question
        char answers[] = {'A','B','B','A','C','B','D','C','B','B'};

        // Loop through each question in the quiz
        for(int i = 0; i < questions.length; i++) {

            // Display question number and the question text
            System.out.println("\n--------------------------------");
            System.out.println("Question " + (i+1) + " of " + questions.length);
            System.out.println(questions[i]);

            // Display the four options for the current question
            for(int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            // Prompt user for answer and read input
            System.out.print("Enter your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Check if user's answer matches the correct answer
            if(userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++; // Increment score for correct answer
            }
            else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        // Calculate percentage score
        int percentage = (score * 100) / questions.length;

        // Display quiz results header
        System.out.println("\n================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("================================");

        // Display detailed score breakdown
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");

        // Provide feedback based on percentage score
        if(percentage >= 80)
            System.out.println("Result: Excellent! You are a Java Expert!");
        else if(percentage >= 50)
            System.out.println("Result: Good! Keep practicing.");
        else
            System.out.println("Result: Needs Improvement.");

        // Update high score if current score is higher
        if(score > highScore) {
            highScore = score;
        }

        // Display the current high score
        System.out.println("High Score: " + highScore);

        // Ask user if they want to play again
        System.out.println("\nDo you want to play again?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int retry = sc.nextInt();

        // If user chooses to play again, recursively call startQuiz
        if(retry == 1) {
            startQuiz(sc);
        }
    }
}