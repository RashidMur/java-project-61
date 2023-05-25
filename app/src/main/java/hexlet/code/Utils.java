package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int minNumber, int maxNumber) {
        int diff = maxNumber - minNumber;
        Random random = new Random();
        return random.nextInt(diff + 1);
    }
}
