package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void engine(String[][] questionAndAnswer, String rules) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (var i = 0; i < ROUNDS; i++) {
            String question = questionAndAnswer[i][QUESTION];
            String correctAnswer = questionAndAnswer[i][ANSWER];
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String userAnswer = sc.nextLine();


            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                        + correctAnswer + "\'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
