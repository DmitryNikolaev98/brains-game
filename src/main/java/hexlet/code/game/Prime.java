package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final int MAX_RANDOM_NUMBER = 89;

    public static void primeGame() {

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] askAndQuestion = new String[Engine.NUMBER_OF_ROUNDS][Engine.AMOUNT_QUESTION];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            int randomNumber = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

            askAndQuestion[i][Engine.QUESTION_NUMBER] = String.valueOf(randomNumber);
            askAndQuestion[i][Engine.ANSWER_NUMBER]
                    = isPrime(Integer.parseInt(askAndQuestion[i][Engine.QUESTION_NUMBER]));

        }

        Engine.startGame(description, askAndQuestion);

    }

    private static String isPrime(int checkNumber) {
        boolean isPrime = true;

        for (int i = 2; i < checkNumber; i++) {

            if (checkNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime ? "yes" : "no";

    }
}
