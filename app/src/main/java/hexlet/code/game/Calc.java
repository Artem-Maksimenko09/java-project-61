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
        String[] randomOperatorsArray = {"+", "-", "*"};
        Random random = new Random();
        return randomOperatorsArray[random.nextInt(MAXRANDOMOPERATOR)];
    }

    public static int calculate(int firstOperand, int secondOperand, String operator) {
        switch (operator) {
            case "+": return firstOperand + secondOperand;
            case "-": return firstOperand - secondOperand;
            case "*": return firstOperand * secondOperand;
            default: throw new RuntimeException("Unknown user input " + operator);
        }
    }

    public static String[][] calcArray() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (var i = 0; i < ROUNDS; i++) {
            int randomNumberOne = random.nextInt(MAXRANDOM);
            int randomNumberTwo = random.nextInt(MAXRANDOM);
            String randomOperator = randomOperator();
            int correctAnswerInt = calculate(randomNumberOne, randomNumberTwo, randomOperator);
            questionAndAnswer[i][QUESTION] = String.valueOf(randomNumberOne
                    + " " + randomOperator + " " + randomNumberTwo);
            questionAndAnswer[i][ANSWER] = String.valueOf(correctAnswerInt);
        }
        return questionAndAnswer;
    }

    public static void runCalc() {
        String[][] questionAndAnswer = calcArray();
        engine(questionAndAnswer, CALCRULES);
    }
}
