import java.util.Scanner;

public class QuizChallengeGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char playAgain;

        do {

            int score = 0;

            String[][] questions = {
                {
                    "What does CPU stand for?",
                    "A. Central Processing Unit",
                    "B. Computer Personal Unit",
                    "C. Central Program Utility",
                    "D. Control Processing User",
                    "A"
                },
                {
                    "Which device is used to type text?",
                    "A. Monitor",
                    "B. Keyboard",
                    "C. Speaker",
                    "D. Printer",
                    "B"
                },
                {
                    "Which one is an input device?",
                    "A. Monitor",
                    "B. Printer",
                    "C. Mouse",
                    "D. Speaker",
                    "C"
                },
                {
                    "What does HTML stand for?",
                    "A. Hyper Text Markup Language",
                    "B. High Text Machine Language",
                    "C. Home Tool Markup Language",
                    "D. Hyperlinks Text Management Language",
                    "A"
                },
                {
                    "Which symbol ends a Java statement?",
                    "A. :",
                    "B. ;",
                    "C. ,",
                    "D. .",
                    "B"
                },
                {
                    "Which keyword is used to create a class in Java?",
                    "A. create",
                    "B. object",
                    "C. class",
                    "D. newclass",
                    "C"
                },
                {
                    "Which method is the starting point of a Java program?",
                    "A. start()",
                    "B. main()",
                    "C. run()",
                    "D. begin()",
                    "B"
                },
                {
                    "Which data type stores whole numbers in Java?",
                    "A. double",
                    "B. String",
                    "C. boolean",
                    "D. int",
                    "D"
                },
                {
                    "Which loop executes while a condition is true?",
                    "A. while",
                    "B. switch",
                    "C. if",
                    "D. break",
                    "A"
                }
            };

            System.out.println("==================================");
            System.out.println("       QUIZ CHALLENGE GAME");
            System.out.println("==================================");
            System.out.println("Answer the questions correctly!");
            System.out.println("Each correct answer is worth 10 points.");

            for (int level = 0; level < 3; level++) {

                System.out.println("\n========== LEVEL " + (level + 1) + " ==========");

                for (int q = 0; q < 3; q++) {

                    int index = (level * 3) + q;

                    System.out.println("\nQuestion " + (q + 1) + ":");
                    System.out.println(questions[index][0]);

                    for (int option = 1; option <= 4; option++) {
                        System.out.println(questions[index][option]);
                    }

                    System.out.print("Your answer (A/B/C/D): ");
                    String answer = input.nextLine().trim().toUpperCase();

                    while (!answer.equals("A") &&
                           !answer.equals("B") &&
                           !answer.equals("C") &&
                           !answer.equals("D")) {

                        System.out.print("Invalid choice! Enter A, B, C, or D: ");
                        answer = input.nextLine().trim().toUpperCase();
                    }

                    if (answer.equals(questions[index][5])) {
                        System.out.println("Correct Answer! +10 points");
                        score += 10;
                    } else {
                        System.out.println("Wrong Answer!");
                        System.out.println("Correct answer: " +
                                questions[index][5]);
                    }

                    System.out.println("Current Score: " + score);
                }

                System.out.println("\nLevel " + (level + 1) + " Completed!");
                System.out.println("Your score: " + score);
            }

            System.out.println("\n==================================");
            System.out.println("           GAME RESULTS");
            System.out.println("==================================");
            System.out.println("Final Score: " + score + " / 90");

            if (score >= 80) {
                System.out.println("Excellent! You are a Quiz Master!");
            } else if (score >= 60) {
                System.out.println("Great job! Keep learning!");
            } else if (score >= 40) {
                System.out.println("Good effort! Keep practicing!");
            } else {
                System.out.println("Don't give up! Try again!");
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = input.nextLine().trim().toUpperCase().charAt(0);

            while (playAgain != 'Y' && playAgain != 'N') {
                System.out.print("Please enter Y or N: ");
                playAgain = input.nextLine().trim().toUpperCase().charAt(0);
            }

        } while (playAgain == 'Y');

        System.out.println("\nThank you for playing Quiz Challenge Game!");
        System.out.println("Goodbye!");

        input.close();
    }
}
