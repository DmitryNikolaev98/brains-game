package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("Your choice:");
        int number = scanner.nextInt();
        switch (number) {
            case greet -> Cli.greeting();
            case even -> Even.evenGame();
            case calc -> Calc.calcGame();
            case gcd -> Gcd.gcdGame();
            case progression -> Progression.progressionGame();
            case prime -> Prime.primeGame();
            default -> System.exit(0);
        }
    }
}
