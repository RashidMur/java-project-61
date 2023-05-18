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
            int[] arr = new int[randomLongArr];
            arr[0] = startNumder;
            for (int j = 1; j <= arr.length - 1; j++) { // строим арифмитическую прогрессию и записываем в массив
                arr[j] = arr[j - 1] + randomStep;
            }
            questionAnswer[i][0] = "";
            int ranNumder = randomStartArr.nextInt(randomLongArr - 1); // рандомное число в рамках массива
            for (int j = 0; j < arr.length; j++) {
                if (j == ranNumder) { // замена рандомного числа на ".."
                    questionAnswer[i][0] = questionAnswer[i][0] + " " + "..";
                } else {
                    String randomNumbstr1 = Integer.toString(arr[j]);
                    questionAnswer[i][0] = questionAnswer[i][0] + " " + randomNumbstr1;
                }
                String randomNumbstr2 = Integer.toString(arr[ranNumder]);
                questionAnswer[i][1] = randomNumbstr2;
            }
        }
        Engine.greetings(condition, questionAnswer);
    }
}
