package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void prime() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int minNumber = 2;
        final int maxNumber = 100;
        int diff = maxNumber - minNumber;
        final int maxNumberRound = 3;
        Random random = new Random();
        String[][] questionAnswer = new String[maxNumberRound][2];
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int randomNumb = random.nextInt(diff + 1);
            int sum = 0;
            for (int j = 1; j <= randomNumb; j++) {
                if (randomNumb % j == 0) { // делим randomNumb пока остаток от деления == 0 и суммируем
                    sum++;
                }
            }
            if (sum == 2) {
                String randomNumbstr = Integer.toString(randomNumb);
                questionAnswer[i][0] = randomNumbstr;
                questionAnswer[i][1] = "yes";
            } else {
                String randomNumbstr = Integer.toString(randomNumb);
                questionAnswer[i][0] = randomNumbstr;
                questionAnswer[i][1] = "no";
            }
        }
        Engine.greetings(condition, questionAnswer);
    }
}

