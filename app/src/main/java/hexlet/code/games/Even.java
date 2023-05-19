package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void even() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRound = 3;
        String[][] questionAnswer = new String[maxNumberRound][2];
        int diff = maxNumber - minNumber;
        Random random = new Random();
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int randomNumb = random.nextInt(diff + 1);

            if (randomNumb % 2 == 0) {
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
