package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet\s
                2 - Even\s
                3 - Calc\s
                0 - Exit\s
                Your choice:\s """);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calcGame();
                break;
            case 4:
                GCD.gcdGame();
                break;
            case 0:
        }
    }
}
