package hexlet.code;

import java.util.Scanner;

import static hexlet.code.game.Calc.runCalc;
import static hexlet.code.game.Even.runEven;
import static hexlet.code.game.GCD.runGcd;
import static hexlet.code.game.Prime.runPrime;
import static hexlet.code.game.Progression.runProgression;


public class App {
    public static void main(String[] args) {
        Scanner numGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        String num = String.valueOf(numGame.nextInt());
        System.out.println("Your choice: " + num);

        switch (num) {
            case "1":  System.out.println("Welcome to the Brain Games!");
                Cli.gretting();
                break;
            case "2":  runEven();
                break;
            case "3":  runCalc();
                break;
            case "4":  runGcd();
                break;
            case "5":  runProgression();
                break;
            case "6":  runPrime();
                break;
            default:   System.out.println("Unknown user choice: " + num);
                break;
        }

        numGame.close();
    }
}