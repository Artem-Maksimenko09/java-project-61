package hexlet.code.game;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
