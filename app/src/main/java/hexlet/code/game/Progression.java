package hexlet.code.game;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class Progression {
    public static final String PROGRESSIONRULES = "What number is missing in the progression?";
    public static final int MINLENGTHPROGRESSION = 5;
    public static final int MAXLENGTHPROGRESSION = 11;
    public static final int MINSTARTPROGRESSION = 1;
    public static final int MAXSTARTPROGRESSION = 5;
    public static final int MINSTEPPROGRESSION = 3;
    public static final int MAXSTEPPROGRESSION = 7;

    public static int startProgression() {
        Random random = new Random();
        int start = random.nextInt(MINSTARTPROGRESSION, MAXSTARTPROGRESSION);
        return start;
    }

    public static int stepProgression() {
        Random random = new Random();
        int step = random.nextInt(MINSTEPPROGRESSION, MAXSTEPPROGRESSION);
        return step;
    }

    public static int lengthProgression() {
        Random random = new Random();
        int length = random.nextInt(MINLENGTHPROGRESSION, MAXLENGTHPROGRESSION);
        return length;
    }

    public static String[] getProgression(int start, int step, int length) {
        String[] progressionArray = new String[length];
        int nextElement = start;

        for (var i = 0; i < length; i++) {
            progressionArray[i] = String.valueOf(nextElement);
            nextElement = nextElement + step;
        }
        return progressionArray;
    }

    public static String[][] progressionArrayCorrect() {
        String[][] questionAndAnswer = new String[ROUNDS][2];
        Random random = new Random();

        for (var i = 0; i < ROUNDS; i++) {
            String[] progressionArray = getProgression(startProgression(), stepProgression(), lengthProgression());
            int progressionArrayLength = progressionArray.length;
            int randomElement = random.nextInt(1, progressionArrayLength);
            questionAndAnswer[i][ANSWER] = progressionArray[randomElement];
            progressionArray[randomElement] = "..";
            questionAndAnswer[i][QUESTION] = String.join(" ", progressionArray);
        }
        return questionAndAnswer;
    }

    public static void runProgression() {
        String[][] questionAndAnswer = progressionArrayCorrect();
        engine(questionAndAnswer, PROGRESSIONRULES);
    }
}
