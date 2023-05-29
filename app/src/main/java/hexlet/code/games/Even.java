package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String CONDITION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MIN_NUMBER = 2;
    public static final int MAX_NUMBER = 100;

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumb = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        roundData[0] = Integer.toString(randomNumb);
        roundData[1] = isEven(randomNumb) ? "yes" : "no";
        return roundData;
    }
    public static void even() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataEven = generateRoundData();
            questionAnswer[i][0] = roundDataEven[0];
            questionAnswer[i][1] = roundDataEven[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
