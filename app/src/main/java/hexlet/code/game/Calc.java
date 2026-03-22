package hexlet.code.game;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.engine;

public class Calc {
    public static final String CALCRULES = "What is the result of the expression?";
    public static final int MAXRANDOM = 20;
    public static final int MAXRANDOMOPERATOR = 3;

    public static String randomOperator() {
        Random random = new Random();
        int randomNumOperator = random.nextInt(MAXRANDOMOPERATOR);
        String operator = switch (randomNumOperator) {
            case 0 -> "+";
            case 1 -> "-";
            default -> "*";
        };
        return operator;
    }

    public static String[][] calcArray() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            int randomNumberOne = random.nextInt(MAXRANDOM);
            int randomNumberTwo = random.nextInt(MAXRANDOM);
            String randomChar = randomOperator();
            if (randomChar == "+") {
                int correctAnswerInt = randomNumberOne + randomNumberTwo;
                questionAndAnswer[i][QUESTION] = String.valueOf(randomNumberOne
                        + " + " + randomNumberTwo);
                questionAndAnswer[i][ANSWER] = String.valueOf(correctAnswerInt);
            } else if (randomChar == "-") {
                int correctAnswerInt = randomNumberOne - randomNumberTwo;
                questionAndAnswer[i][QUESTION] = String.valueOf(randomNumberOne
                        + " - " + randomNumberTwo);
                questionAndAnswer[i][ANSWER] = String.valueOf(correctAnswerInt);
            } else if (randomChar == "*") {
                int correctAnswerInt = randomNumberOne * randomNumberTwo;
                questionAndAnswer[i][QUESTION] = String.valueOf(randomNumberOne
                        + " * " + randomNumberTwo);
                questionAndAnswer[i][ANSWER] = String.valueOf(correctAnswerInt);
            }
        }
        return questionAndAnswer;
    }

    public static void runCalc() {
        String[][] questionAndAnswer = calcArray();
        engine(questionAndAnswer, CALCRULES);
    }
}
