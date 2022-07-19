package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    public static final int MAX_RANDOM_NUMBER = 89;
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void game() {
        String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int randomNumber = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

            askAndQuestion[i][Engine.QUESTION_NUMBER] = String.valueOf(randomNumber);
            boolean answer = isPrime(Integer.parseInt(askAndQuestion[i][Engine.QUESTION_NUMBER]));
            askAndQuestion[i][Engine.ANSWER_NUMBER] = answer ? "yes" : "no";
        }
        Engine.startGame(DESCRIPTION, askAndQuestion);
    }
    private static boolean isPrime(int checkNumber) {
        boolean isPrime = true;
        if (checkNumber < 2) {
            return false;
        }

        for (int i = 2; i < checkNumber; i++) {
            if (checkNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
