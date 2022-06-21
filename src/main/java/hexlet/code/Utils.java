package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNumber(int numberMax) {
        Random random = new Random();
        int randomNumber = (int) random.nextInt(numberMax) + 1;
        return randomNumber;
    }
}
