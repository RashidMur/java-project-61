package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void progression() {
        String condition = "What number is missing in the progression?";
        final int minNumber = 5;
        final int maxNumber = 10;
        final int maxNumberRound = 3;
        int diff = maxNumber - minNumber;
        Random random = new Random();
        String[][] questionAnswer = new String[3][2];
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int randomLongArr = random.nextInt(diff + 1); // рандомный размер массива
            int randomStep = random.nextInt(diff + 1); // рандомный шаг прогрессии
            randomLongArr += minNumber;
            randomStep += minNumber;
            final int minNumberArr = 1;
            final int maxNumberArr = 50;
            int diff1 = maxNumberArr - minNumberArr;
            Random randomStartArr = new Random();
            int startNumder = randomStartArr.nextInt(diff1 + 1);
            String[] arr = new String[randomLongArr];
            arr[0] = Integer.toString(startNumder);
            for (int j = 1; j <= arr.length - 1; j++) { // строим арифмитическую прогрессию и записываем в массив
                arr[j] = Integer.toString(Integer.parseInt(arr[j - 1]) + randomStep);
            }
            int ranIndex = randomStartArr.nextInt(randomLongArr - 1); // рандомное число в рамках массива
            questionAnswer[i][1] = arr[ranIndex];
            arr[ranIndex] = "..";
            String progStr = String.join(" ", arr);
            questionAnswer[i][0] = progStr;
        }
        Engine.greetings(condition, questionAnswer);
    }
}
