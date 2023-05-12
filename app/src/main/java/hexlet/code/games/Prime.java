package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Engine.greetings();
        Scanner scannerPrimeName = new Scanner(System.in);
        String userName = scannerPrimeName.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int minNumber = 2;
        final int maxNumber = 100;
        int diff = maxNumber - minNumber;
        final int maxNumberRound = 3;
        Random random = new Random();
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            int randomNumber = random.nextInt(diff + 1);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scannerPrimeName.next();
            int sum = 0;
            for (int j = 1; j <= randomNumber; j++) {
                if (randomNumber % j == 0) { // делим randomNumber пока остаток от деления == 0 и суммируем
                    sum++;
                }
            }
            // принимается ответ либо yes либо no, иначе прекращаем
            if (answer.equals("yes") || answer.equals("no")) {
                // если количество раз деления randomNumber без остатка равно 2 а ответ пользователя yes или
                // если количество раз деления randomNumber без остатка больше 2 а ответ пользователя no
                if (sum == 2 && answer.equals("yes") || sum > 2 && answer.equals("no")) {
                    Engine.correct();
                    // и наоборот
                } else if (sum > 2 && answer.equals("yes") || sum == 2 && answer.equals("no")) {
                    Engine.wrongAnswer(answer, userName);
                    break;
                }
            } else {
                break;
            }
        }
        Engine.congratulations(i, userName);
    }
}
