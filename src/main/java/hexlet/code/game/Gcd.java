package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static final int MAX_RANDOM_NUMBER = 89;

    public static void gcdGame() {

        String description = "Find the greatest common divisor of given numbers.";

        String[][] askAndQuestion = new String[Engine.NUMBER_OF_ROUNDS][Engine.AMOUNT_QUESTION];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int expression1 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int expression2 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

            askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " " + expression2;
            askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(gcd(expression1, expression2));
        }

        Engine.startGame(description, askAndQuestion);

    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
