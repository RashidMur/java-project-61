package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN_NUMBER = 2;
    public static final int MAX_NUMBER = 100;
    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int randomNumb = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        if (isPrime(randomNumb) == 0) {
            String randomNumbstr = Integer.toString(randomNumb);
            roundData[0] = randomNumbstr;
            roundData[1] = "yes";
        } else {
            String randomNumbstr = Integer.toString(randomNumb);
            roundData[0] = randomNumbstr;
            roundData[1] = "no";
        }
        return roundData;
    }
    public static void prime() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataPrime = generateRoundData();
            questionAnswer[i][0] = roundDataPrime[0];
            questionAnswer[i][1] = roundDataPrime[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static int isPrime(int number) {
        int sum = 0;
        for (int j = 1; j <= number; j++) {
            if (number % j == 0) { // делим number пока остаток от деления == 0 и суммируем
                sum++;
            }
        }
        return sum;
    }
}



