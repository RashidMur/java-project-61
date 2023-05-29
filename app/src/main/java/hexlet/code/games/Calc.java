package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String CONDITION = "What is the result of the expression?";
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static String[] generateRoundData() {
        String[] operand = new String[]{"+", "-", "*"};
        String[] roundData = new String[2];
        int n = (int) Math.floor(Math.random() * operand.length);
        int randomNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        int randomNumberNext = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        roundData[1] = Integer.toString(generateCalc(randomNumber, randomNumberNext, n));
        roundData[0] = randomNumber + " " + operand[n] + " " + randomNumberNext;
        return roundData;
    }
    public static void calc() {
        String[][] questionAnswer = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            String[] roundDataPrime = generateRoundData();
            questionAnswer[i][0] = roundDataPrime[0];
            questionAnswer[i][1] = roundDataPrime[1];
        }
        Engine.engineRun(CONDITION, questionAnswer);
    }
    public static int generateCalc(int number, int numberNext, int n) {
        String[] operand = new String[]{"+", "-", "*"};
        return switch (operand[n]) {
            case "+" -> number + numberNext;
            case "-" -> number - numberNext;
            case "*" -> number * numberNext;
            default -> throw new Error("Unknown order state: '${operand[n]}'!");
        };
    }
}
