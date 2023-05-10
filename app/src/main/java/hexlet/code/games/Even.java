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
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i;
        for (i = 0; i < 3; i++) {
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
