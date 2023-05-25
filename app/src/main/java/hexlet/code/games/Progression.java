package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String CONDITION = "What number is missing in the progression?";
    public static final int MIN_NUMBER = 5;
    public static final int MAX_NUMBER = 10;
    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomLongArr = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // рандомный размер массива
        int randomStep = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // рандомный шаг прогрессии
        randomLongArr += MIN_NUMBER;
        randomStep += MAX_NUMBER;
        int startNumder = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // начальный элемент прогрессии
        int ranIndex = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER); // рандомный индекс в рамках массива
        String[] arrRoundData = isPogression(randomLongArr, startNumder, randomStep);
        roundData[1] = arrRoundData[ranIndex];
        arrRoundData[ranIndex] = "..";
        String progStr = String.join(" ", arrRoundData);
        roundData[0] = progStr;
        return roundData;
    }
    public static void progression() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataGcd = generateRoundData();
            questionAnswer[i][0] = roundDataGcd[0];
            questionAnswer[i][1] = roundDataGcd[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static String[] isPogression(int randomLongArr, int startNumder, int randomStep) {
        String[] arr = new String[randomLongArr];
        arr[0] = Integer.toString(startNumder);
        for (int j = 1; j <= arr.length - 1; j++) { // строим арифмитическую прогрессию и записываем в массив
            arr[j] = Integer.toString(Integer.parseInt(arr[j - 1]) + randomStep);
        }
        return arr;
    }
}
