package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static void gcd() {
        String condition = "Find the greatest common divisor of given numbers.";
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRound = 3;
        int diff = maxNumber - minNumber;
        Random random = new Random();
        String[][] questionAnswer = new String[maxNumberRound][2];
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            randomNumber += minNumber;
            randomNumberNext += minNumber;
            int correctNumb = 1;
            for (int j = 1; j <= randomNumber && j <= randomNumberNext; j++) {
                if (randomNumber % j == 0 && randomNumberNext % j == 0) { // делим обе цифры пока остатки от деления ==0
                    correctNumb = j;
                }
                String randomNumbstr = Integer.toString(correctNumb);
                questionAnswer[i][1] = randomNumbstr;
            }
            String randomNumbstr1 = Integer.toString(randomNumber);
            String randomNumbstr2 = Integer.toString(randomNumberNext);
            questionAnswer[i][0] = randomNumbstr1 + " " + randomNumbstr2;
        }
        Engine.greetings(condition, questionAnswer);
    }
}
