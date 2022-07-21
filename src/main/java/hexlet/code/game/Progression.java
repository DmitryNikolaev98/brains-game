package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    public static final int MAX_RANDOM_NUMBER = 89;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 10;
    public static final int LENGTH_PROGRESSION = 10;
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static void game() {
        String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int startProgressionGame = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int stepProgressionGame = Utils.differanceMaxAndMin(MAX_STEP, MIN_STEP);
            int hiddenNumber = Utils.generateRandomNumber(LENGTH_PROGRESSION - 1);
            String[] rowNumberProgression = new String[LENGTH_PROGRESSION];
            String[] rowProgression = {"", "", ""};
            String[] numbers = generateProgression(startProgressionGame, stepProgressionGame);

            for (int j = 0; j < LENGTH_PROGRESSION; j++) {
                var result = new StringBuilder();

                if (j == hiddenNumber) {
                    result.append(".. ");
                } else {
                    result.append(numbers[j]).append(" ");
                }
                rowNumberProgression[j] = String.valueOf(result);
                rowProgression[i] += rowNumberProgression[j];
            }
            askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(numbers[hiddenNumber]);
            askAndQuestion[i][Engine.QUESTION_NUMBER] = rowProgression[i];
        }
        Engine.startGame(DESCRIPTION, askAndQuestion);
    }
    public static String[] generateProgression(int startProgressionGame, int stepProgressionGame) {
        String[] progression = new String[LENGTH_PROGRESSION];

        for (int j = 0; j < LENGTH_PROGRESSION; j++) {
            progression[j] = String.valueOf(startProgressionGame + (j * stepProgressionGame));
        }
        return progression;
    }
}
