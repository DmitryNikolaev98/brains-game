package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNumber(int numberMax) {
        Random random = new Random();
        return random.nextInt(numberMax) + 1;
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
