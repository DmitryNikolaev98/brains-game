package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    public static final int MAX_RANDOM_NUMBER = 15;
    public static final String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][Engine.AMOUNT_QUESTION];

    public static void calcGame() {
        String description = "Welcome to the Brain Games!";
        Calc.calculate();
        Engine.startGame(description, askAndQuestion);
    }
    public static void calculate() {
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int randomNumberOne = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int randomNumberTwo = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);

            String operators = String.valueOf(Calc.generateOperator());

            switch (operators) {
                case "+" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = randomNumberOne + " + " + randomNumberTwo;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(randomNumberOne + randomNumberTwo);
                }
                case "-" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = randomNumberOne + " - " + randomNumberTwo;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(randomNumberOne - randomNumberTwo);
                }
                case "*" -> {
                    askAndQuestion[i][Engine.QUESTION_NUMBER] = randomNumberOne + " * " + randomNumberTwo;
                    askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(randomNumberOne * randomNumberTwo);
                }
                default -> {

                }
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
