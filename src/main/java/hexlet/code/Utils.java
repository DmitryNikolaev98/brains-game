package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNumber(int numberMax) {
        Random random = new Random();
        return random.nextInt(numberMax) + 1;
    }

    public static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        int i = random.nextInt(3);
        return operators[i];
    }

    public static  int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
