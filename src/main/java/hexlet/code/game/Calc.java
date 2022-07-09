package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    public static final int MAX_RANDOM_NUMBER = 25;

    public static void calcGame() {

        String description = "Welcome to the Brain Games!";

        String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][Engine.AMOUNT_QUESTION];

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int expression1 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int expression2 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

            String operators = String.valueOf(Calc.generateOperator());

            switch (operators) {
                case "+" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " + " + expression2;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(expression1 + expression2);
                }
                case "-" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " - " + expression2;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(expression1 - expression2);
                }
                case "*" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " * " + expression2;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(expression1 * expression2);
                }
                default -> {

                }
            }
        }

        Engine.startGame(description, askAndQuestion);

    }

    public static String generateOperator() {
        final int randomOperator = 3;
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        int i = random.nextInt(randomOperator);
        return operators[i];
    }
}
