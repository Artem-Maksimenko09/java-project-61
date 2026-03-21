package hexlet.code.game;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class Even {
    public static final String EVENRULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[][] evenArray() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            int randomNumber = random.nextInt(50);
            String evenCorrect = randomNumber % 2 == 0 ? "yes" : "no";
            questionAndAnswer[i][QUESTION] = String.valueOf(randomNumber);
            questionAndAnswer[i][ANSWER] = evenCorrect;
        }
        return questionAndAnswer;
    }

    public static void runEven() {
        String[][] questionAndAnswer = evenArray();
        engine(questionAndAnswer, EVENRULES);
    }
}
