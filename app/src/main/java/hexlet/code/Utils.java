package hexlet.code;

public class Utils {
    public static int generateNumber(int minNumber, int maxNumber) {
        maxNumber -= minNumber;
        return (int) (Math.random() * ++maxNumber) + minNumber;
    }
}
