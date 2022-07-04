package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        static final int gameNumberCli = 1;
        static final int gameNumberCalc = 2;
        static final int gameNumberEven = 3;
        static final int gameNumberGcd = 4;
        static final int gameNumberPrime = 5;
        static final int gameNumberProgression = 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet\s
                2 - Even\s
                3 - Calc\s
                4 - GCD\s
                5 - Progression\s
                6 - Prime\s
                0 - Exit\s
                Your choice:\s """);

        int number = scanner.nextInt();

        switch (number) {
            case 1 -> Cli.greeting();
            case 2 -> Even.evenGame();
            case 3 -> Calc.calcGame();
            case 4 -> Gcd.gcdGame();
            case 5 -> Progression.progressionGame();
            case 6 -> Prime.primeGame();
            default -> System.exit(0);
        }
    }
}
