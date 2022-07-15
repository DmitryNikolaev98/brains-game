package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAX_NUMBER = 89;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void game() {
        String[][] answerAndQuestion = new String[Engine.NUMBER_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            answerAndQuestion[i][Engine.QUESTION_NUMBER]
                    = String.valueOf(Utils.generateRandomNumber(MAX_NUMBER));
            answerAndQuestion[i][Engine.ANSWER_NUMBER]
                    = Even.isEven(Integer.parseInt(answerAndQuestion[i][Engine.QUESTION_NUMBER]));
        }
        Engine.startGame(DESCRIPTION, answerAndQuestion);
    }
    public static String isEven(int checkNumber) {
        return checkNumber % 2 == 0 ? "yes" : "no";
    }
}
