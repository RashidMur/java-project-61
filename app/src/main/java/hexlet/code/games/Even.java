package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Engine.greetings();
        Scanner scannerEven = new Scanner(System.in);
        String userName = scannerEven.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String yes = "yes";
        String no = "no";
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRоund = 3;
        int diff = maxNumber - minNumber;
        Random random = new Random();
        int i;
        for (i = 0; i < maxNumberRоund; i++) {
            int randomNumber = random.nextInt(diff + 1);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scannerEven.next();
            // принимается ответ либо yes либо no, иначе прекращаем
            if (answer.equalsIgnoreCase(yes) || answer.equalsIgnoreCase(no)) {
                // если randomNumber делится на 2 без остатка и ответ пользователя yes
                // если randomNumber не делится на 2 без остатка и ответ пользователя no
                if (randomNumber % 2 == 0 && answer.equals(yes) || randomNumber % 2 != 0 && answer.equals(no)) {
                    Engine.correct();
                    // иначе
                } else if (randomNumber % 2 != 0 && answer.equals(yes) || randomNumber % 2 == 0 && answer.equals(no)) {
                    Engine.wrongAnswer(yes, userName, answer);
                    break;
                }
            } else {
                break;
            }
        }
        Engine.congratulations(i, userName);
    }
}
