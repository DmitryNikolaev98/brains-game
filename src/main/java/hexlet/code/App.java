package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet \n" +
                "2 - Even \n" +
                "3 - Calc \n" +
                "0 - Exit \n" +
                "Your choice: ");

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
            case 0:
        }
    }
}
