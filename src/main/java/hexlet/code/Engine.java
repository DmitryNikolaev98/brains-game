package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int QUESTION_NUMBER = 0;
    public static final int ANSWER_NUMBER = 1;

    public static void startGame(String description, String[][] answerAndQuestion) {

        // Приветсвие
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                           "May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        // Вопросы
        int count = 0;
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            System.out.println("Question: " + answerAndQuestion[i][Engine.QUESTION_NUMBER] + "\n" +
                               "Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(answerAndQuestion[i][Engine.ANSWER_NUMBER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was" + answerAndQuestion[i][Engine.ANSWER_NUMBER] + ".\n" +
                                   "Let's try again, " + userName + "!");
                break;
            }
            count++;
        }
        // Поздравление
        switch (count) {
            case 3:
                System.out.println("Congratulations, " + userName + "!");
        }
    }
}