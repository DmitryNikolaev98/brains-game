package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 101);
            System.out.println("Question: " + randomNumber + "\n" +
                    "Your answer: ");
            String answer = scanner.next();

            if (randomNumber % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (randomNumber % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, Bill!");
                break;
            }
            count++;
        }

        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
