package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String CONDITION = "What number is missing in the progression?";
    public static final int MIN_NUMBER = 5;
    public static final int MAX_NUMBER = 10;
    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int longProgression = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // рандомный размер массива
        int randomStep = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // рандомный шаг прогрессии
        int startNumder = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // начальный элемент прогрессии
        int randomIndex = Utils.generateNumber(0, longProgression - 1); // рандомный индекс в рамках массива
        String[] progressionRoundData = generateProgression(longProgression, startNumder, randomStep);
        roundData[1] = progressionRoundData[randomIndex];
        progressionRoundData[randomIndex] = "..";
        roundData[0] = String.join(" ", progressionRoundData);
        return roundData;
    }
    public static void progression() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataProgression = generateRoundData();
            questionAnswer[i][0] = roundDataProgression[0];
            questionAnswer[i][1] = roundDataProgression[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static String[] generateProgression(int longProgression, int startNumder, int randomStep) {
        String[] progressionOfNumb = new String[longProgression];
        progressionOfNumb[0] = Integer.toString(startNumder);
        for (int j = 1; j <= progressionOfNumb.length - 1; j++) { // строим арифмитическую прогрессию в массиве
            progressionOfNumb[j] = Integer.toString(Integer.parseInt(progressionOfNumb[j - 1]) + randomStep);
        }
        return progressionOfNumb;
    }
}
