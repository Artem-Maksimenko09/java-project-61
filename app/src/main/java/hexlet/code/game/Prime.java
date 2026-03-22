package hexlet.code.game;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class Prime {
    public static final String PRIMERULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String getPrime(int randomNumber) {
        if (randomNumber < 2) {
            return "no";
        } else if (randomNumber == 2) {
            return "yes";
        } else {
            for (var i = 2; i * i < randomNumber; i++) {
                if (randomNumber % i == 0) {
                    return "no";
                }
            }
            return "yes";
        }
    }

    public static String[][] primeArray() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            int randomNumber = random.nextInt(30);
            questionAndAnswer[i][QUESTION] = String.valueOf(randomNumber);
            questionAndAnswer[i][ANSWER] = getPrime(randomNumber);
        }
        return questionAndAnswer;
    }

    public static void runPrime() {
        String[][] questionAndAnswer = primeArray();
        engine(questionAndAnswer, PRIMERULES);
    }
}
