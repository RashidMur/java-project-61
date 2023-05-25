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
        String randomNumbstr = Integer.toString(isCalc(randomNumber, randomNumberNext, n));
        roundData[1] = randomNumbstr;
        String randomNumbstr1 = Integer.toString(randomNumber);
        String randomNumbstr2 = Integer.toString(randomNumberNext);
        roundData[0] = randomNumbstr1 + " " + operand[n] + " " + randomNumbstr2;
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
    public static int isCalc(int number, int numberNext, int n) {
        String[] operand = new String[]{"+", "-", "*"};
        return switch (operand[n]) {
            case "+" -> number + numberNext;
            case "-" -> number - numberNext;
            case "*" -> number * numberNext;
            default -> {
                System.out.println("null");
                yield 0;
            }
        };
    }
}
