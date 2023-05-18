package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calc() {
        String condition = "What is the result of the expression?";
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRound = 3;
        int diff = maxNumber - minNumber;
        Random random = new Random();
        String[][] questionAnswer = new String[3][2];
        String[] operand = new String[]{"+", "-", "*"};
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int n = (int) Math.floor(Math.random() * operand.length);
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            int correctNumb = switch (operand[n]) {
                case "+" -> randomNumber + randomNumberNext;
                case "-" -> randomNumber - randomNumberNext;
                case "*" -> randomNumber * randomNumberNext;
                default -> {
                    System.out.println("null");
                    yield 0;
                }
            };
            String randomNumbstr = Integer.toString(correctNumb);
            questionAnswer[i][1] = randomNumbstr;
            String randomNumbstr1 = Integer.toString(randomNumber);
            String randomNumbstr2 = Integer.toString(randomNumberNext);
            questionAnswer[i][0] = randomNumbstr1 + " " + operand[n] + " " + randomNumbstr2;
        }
        Engine.greetings(condition, questionAnswer);
    }
}
