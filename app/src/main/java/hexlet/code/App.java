package hexlet.code;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner numGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int num = numGame.nextInt();
        System.out.println("Your choice: " + num);

        if (num == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.gretting();
        } else if (num == 2) {
            System.out.println("Welcome to the Brain Games!");
            Cli.gretting();
            Even.even();
        }
        numGame.close();
    }
}
