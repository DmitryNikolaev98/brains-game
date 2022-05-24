package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("May I have your name? " + name);
        System.out.println("Hello, " + name + "!");

    }
}
