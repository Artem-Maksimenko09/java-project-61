package hexlet.code.game;

import java.util.Arrays;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class Progression {
    public static final String PROGRESSIONRULES = "What number is missing in the progression?";

    public static String[] getProgression() {
        //currentElement = start + index * step;
        Random random = new Random();
        int lengthProgression = random.nextInt(5, 11);
        String[] progressionArray = new String[lengthProgression];
        int start = random.nextInt(1, 5);
        int step = random.nextInt(3, 7);
        int nextElement = start;

        for (var i = 0; i < lengthProgression; i++) {
            progressionArray[i] = String.valueOf(nextElement);
            nextElement = nextElement + step;
        }
        return progressionArray;
    }

    public static String[][] progressionArrayCorrect() {
        String[][] questionAndAnswer = new String[ROUNDS][2];
        Random random = new Random();

        for (var i = 0; i < ROUNDS; i++) {
            String[] progressionArray = getProgression();
            int progressionArrayLength = progressionArray.length;
            int randomElement = random.nextInt(1, progressionArrayLength);
            questionAndAnswer[i][ANSWER] = progressionArray[randomElement];
            progressionArray[randomElement] = "..";
            questionAndAnswer[i][QUESTION] = Arrays.toString(progressionArray);
            questionAndAnswer[i][QUESTION] = questionAndAnswer[i][QUESTION]
                    .replace('[', ' ')
                    .replace(']', ' ')
                    .replace(',', ' ');
        }
        return questionAndAnswer;
    }

    public static void runProgression() {
        String[][] questionAndAnswer = progressionArrayCorrect();
        engine(questionAndAnswer, PROGRESSIONRULES);
    }
}
