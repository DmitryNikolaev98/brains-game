package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    public static final int MAX_RANDOM_NUMBER = 15;
    public static String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][Engine.AMOUNT_QUESTION];

    public static void game() {
        String description = "Welcome to the Brain Games!";

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            String operators = String.valueOf(Calc.generateOperator());
            calculate(operators, i);
        }
        Engine.startGame(description, askAndQuestion);
    }

    public static void calculate(String operators, int i) {
        int expression1 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
        int expression2 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

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
                System.out.println();
            }
        }
    }
    public static String generateOperator() {
        final int randomOperator = 3;
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        int i = random.nextInt(randomOperator);
        return operators[i];
    }
}
