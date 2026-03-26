import java.util.Scanner;

public class JavaQuizGame {

    static int highScore = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n================================");
            System.out.println("         JAVA QUIZ GAME");
            System.out.println("================================");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Rules");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                startQuiz(sc);
            }
            else if (choice == 2) {
                showRules();
            }
            else if (choice == 3) {
                System.out.println("Thank you for playing!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

    public static void showRules() {

        System.out.println("\n------ QUIZ RULES ------");
        System.out.println("1. Total 10 Questions");
        System.out.println("2. Each correct answer = 1 mark");
        System.out.println("3. No negative marking");
        System.out.println("4. Enter option A/B/C/D");
        System.out.println("------------------------");
    }

    public static void startQuiz(Scanner sc) {

        int score = 0;

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

        char answers[] = {'A','B','B','A','C','B','D','C','B','B'};

        for(int i = 0; i < questions.length; i++) {

            System.out.println("\n--------------------------------");
            System.out.println("Question " + (i+1) + " of " + questions.length);
            System.out.println(questions[i]);

            for(int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if(userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            }
            else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        int percentage = (score * 100) / questions.length;

        System.out.println("\n================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("================================");

        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");

        if(percentage >= 80)
            System.out.println("Result: Excellent! You are a Java Expert!");
        else if(percentage >= 50)
            System.out.println("Result: Good! Keep practicing.");
        else
            System.out.println("Result: Needs Improvement.");

        if(score > highScore) {
            highScore = score;
        }

        System.out.println("High Score: " + highScore);

        System.out.println("\nDo you want to play again?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int retry = sc.nextInt();

        if(retry == 1) {
            startQuiz(sc);
        }
    }
}