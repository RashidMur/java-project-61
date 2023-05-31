package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String CONDITION = "Find the greatest common divisor of given numbers.";
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        int randomNumberNext = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        roundData[1] = Integer.toString(calcualteGcd(randomNumber, randomNumberNext));
        roundData[0] = randomNumber + " " + randomNumberNext;
        return roundData;
    }
    public static void runGame() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataGcd = generateRoundData();
            questionAnswer[i][0] = roundDataGcd[0];
            questionAnswer[i][1] = roundDataGcd[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static int calcualteGcd(int randomNumber, int randomNumberNext) {
        int correctAnswer = 1;
        for (int j = 1; j <= randomNumber && j <= randomNumberNext; j++) {
            if (randomNumber % j == 0 && randomNumberNext % j == 0) { //делим обе цифры пока остатки от деления ==0
                correctAnswer = j;
            }
        }
        return correctAnswer;
    }
}
