package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void even() {
        Scanner evenGame = new Scanner(System.in);
        Random random = new Random();
        int correctAnswer = 0;

        for (var i = 1; i < 4; i++) {
            int randomNumber = random.nextInt(50);

            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + randomNumber);
            String answer = evenGame.nextLine();

            String evenCorrect = randomNumber % 2 == 0 ? "yes" : "no";

            if (answer.equals(evenCorrect)) {
                System.out.println("Correct!");
                correctAnswer += 1;
            } else {
                System.out.println("\'" + answer + "\' is wrong answer ;(. Correct answer was \'"
                        + evenCorrect + "\'.\n"
                        + "Let's try again, " + "NAME" + "!");
                i += 2;
            }
        }

        if (correctAnswer == 3) {
            System.out.println("Congratulations, NAME!");
        }
    }
}
