package hexlet.code;

import java.util.Scanner;

import static hexlet.code.game.Calc.runCalc;
import static hexlet.code.game.Even.runEven;
import static hexlet.code.game.GCD.runGcd;


public class App {
    public static void main(String[] args) {
        Scanner numGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "0 - Exit");
        int num = numGame.nextInt();
        System.out.println("Your choice: " + num);

        switch (num) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.gretting();
                break;
            case 2:
                runEven();
                break;
            case 3:
                runCalc();
                break;
            case 4:
                runGcd();
            default:
                break;
        }

        numGame.close();
    }
}
