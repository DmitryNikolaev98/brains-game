package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNumber(int numberMax) {
        Random random = new Random();
        return random.nextInt(numberMax) + 1;
    }

    public static String generateOperator() {
        int randomOperator = 3;
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        int i = random.nextInt(randomOperator);
        return operators[i];
    }

    public static int differanceMaxAndMin(int max, int min) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int anyNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }


}
