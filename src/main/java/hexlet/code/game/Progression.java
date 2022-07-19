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
            int startProgressionGame = Utils.generateRandomNumber(MAX_RANDOM_NUMBER); // случайное начальное число от 1 до 90
            int stepProgressionGame = Utils.differanceMaxAndMin(MAX_STEP, MIN_STEP);  // шаг прогрессии от 2 до 10
            String[] rowNumberProgression = new String[LENGTH_PROGRESSION]; // массив строк длиной 0 до 9
            String[] rowProgression = {"", "", ""}; //массив строк длиной 0 до 2
            int hiddenNumber = Utils.generateRandomNumber(LENGTH_PROGRESSION - 1);  // случайное число от 0 до 8
            String[] numbers = new String[LENGTH_PROGRESSION]; // массив строк длиной 0 до 9

            for (int j = 0; j < LENGTH_PROGRESSION; j++) {
                numbers[j] = String.valueOf(startProgressionGame + (j * stepProgressionGame));
                rowNumberProgression[j] = (j == hiddenNumber) ? ".. " : ((numbers[j]) + " ");
                rowProgression[i] += rowNumberProgression[j];
                askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(numbers[hiddenNumber]);
                askAndQuestion[i][Engine.QUESTION_NUMBER] = rowProgression[i];
            }
        }
        Engine.startGame(DESCRIPTION, askAndQuestion);
    }
}
