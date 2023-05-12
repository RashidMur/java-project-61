package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        Engine.greetings();
        Scanner scannerCalc = new Scanner(System.in);
        String userName = scannerCalc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRound = 3;
        int diff = maxNumber - minNumber;
        Random random = new Random();
        String[] operand = new String[]{"+", "-", "*"};
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int n = (int) Math.floor(Math.random() * operand.length);
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            Scanner scannerCalc1 = new Scanner(System.in);
            System.out.println("Question: " + randomNumber + " " + operand[n] + " " + randomNumberNext);
            int correctNumb = 0;
            switch (operand[n]) {
                case "+" :
                    correctNumb = randomNumber + randomNumberNext;
                    break;
                case "-" :
                    correctNumb = randomNumber - randomNumberNext;
                    break;
                case "*" :
                    correctNumb = randomNumber * randomNumberNext;
                default :
                    break;
            }
            System.out.print("Your choice: ");
            int userNumb = scannerCalc1.nextInt();
            if (correctNumb == userNumb) { // если число correctAnswer равно числу answer то
                Engine.correct();
            } else {
                Engine.wrongNumber(correctNumb, userNumb, userName);
                break;
            }
        }
        Engine.congratulations(i, userName);

    }
}
