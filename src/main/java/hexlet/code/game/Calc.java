package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;
//import hexlet.code.exceptions.OperationException;

import java.util.Random;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 15;
    public static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "*", "-"};
    public static void game() {
        String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int expression1 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int expression2 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            String operators = String.valueOf(Calc.generateOperator());
            askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " " + operators + " " + expression2;
            askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(calculate(operators, expression1, expression2));
        }
        Engine.startGame(DESCRIPTION, askAndQuestion);
    }
    public static int calculate(String operators, int expression1, int expression2) {

        switch (operators) {
            case "+" -> {
                return expression1 + expression2;
            }
            case "-" -> {
                return expression1 - expression2;
            }
            case "*" -> {
                return expression1 * expression2;
            }
            default -> throw new RuntimeException("Unsupported operation! " + operators);
        }
    }
    public static String generateOperator() {
        final int randomOperator = 3;
        Random random = new Random();
        int i = random.nextInt(randomOperator);
        return OPERATORS[i];
    }
}
