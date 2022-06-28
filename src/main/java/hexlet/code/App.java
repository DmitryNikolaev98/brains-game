package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet\s
                2 - Even\s
                3 - Calc\s
                4 - GCD\s
                5 - Progression\s
                0 - Exit\s
                Your choice:\s """);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                Cli.greeting();
            case 2:
                Even.evenGame();
            case 3:
                Calc.calcGame();
            case 4:
                Gcd.gcdGame();
            case 5:
                Progression.progressionGame();
            case 0:
        }
    }
}
