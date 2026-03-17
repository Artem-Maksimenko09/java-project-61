package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner numGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        int num = numGame.nextInt();
        System.out.println("Your choice: " + num);

        switch (num) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.gretting();
                break;
            case "2":
                System.out.println("Welcome to the Brain Games!");
                Even.even();
                break;
            case "3":
                System.out.println("Welcome to the Brain Games!");
                Calc.calc();
        }

        numGame.close();
    }
}
