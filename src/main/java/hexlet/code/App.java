package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        int number = scanner.nextInt();

        if (number == 1) {
            Cli.greeting();
        } else if (number == 2) {
            Even.gameLogic();
        }
    }
}
