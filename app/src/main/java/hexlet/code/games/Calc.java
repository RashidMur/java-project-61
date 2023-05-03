package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scannerCalc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userNameCalc = scannerCalc.next();
        System.out.println("Hello, " + userNameCalc + "!");
        System.out.println("What is the result of the expression?");
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        String[] operand = new String[]{"+", "-", "*"};
        int i;
        for (i = 0; i < 3; i++) {
            int n = (int) Math.floor(Math.random() * operand.length);
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            randomNumber += min;
            randomNumberNext += min;
            Scanner scannerCalc1 = new Scanner(System.in);
            System.out.println("Question: " + randomNumber + " " + operand[n] + " " + randomNumberNext);
            int correctAnswer = 0;
            switch (operand[n]) {
                case "+" :
                    correctAnswer = randomNumber + randomNumberNext;
                    break;
                case "-" :
                    correctAnswer = randomNumber - randomNumberNext;
                    break;
                case "*" :
                    correctAnswer = randomNumber * randomNumberNext;
                    break;
                default :
                    break;
            }
            System.out.print("Your choice: ");
            int answer = scannerCalc1.nextInt();
            if (correctAnswer == answer) { // если число correctAnswer равно числу answer то
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + userNameCalc + "!");
                break;
            }
        }
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userNameCalc + "!");
        }
    }
}
