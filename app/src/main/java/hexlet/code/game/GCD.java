package hexlet.code.game;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class GCD {
    public static final String GCDRULES = "Find the greatest common divisor of given numbers.";
    public static final int MAXRANDOM = 20;

    public static int gcdCorrect(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String[][] gcdArray() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            int randomNumberOne = random.nextInt(MAXRANDOM);
            int randomNumberTwo = random.nextInt(MAXRANDOM);
            int correctAnswer = gcdCorrect(randomNumberOne, randomNumberTwo);
            questionAndAnswer[i][QUESTION] = String.valueOf(randomNumberOne
                    + " " + randomNumberTwo);
            questionAndAnswer[i][ANSWER] = String.valueOf(correctAnswer);
        }
        return questionAndAnswer;
    }

    public static void runGcd() {
        String[][] questionAndAnswer = gcdArray();
        engine(questionAndAnswer, GCDRULES);
    }
}
