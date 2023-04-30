package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
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
            randomNumber += min;
            System.out.println("Question: " + randomNumber);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equalsIgnoreCase(yes) || answer.equalsIgnoreCase(no)) { // ответ должен быть либо "yes"
                // либо "no", при другом значении игра останавливается
                if (randomNumber % 2 == 0 && answer.equalsIgnoreCase(yes)) { // число randomNumber является четным
                    // и ответ "yes"
                    System.out.println("Correct!");
                } else if (randomNumber % 2 != 0 && answer.equalsIgnoreCase(yes)) { // число randomNumber не является
                    // четным и ответ "yes"
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                } else if (randomNumber % 2 != 0 && answer.equalsIgnoreCase(no)) { //число randomNumber не является
                    // четным и ответ "no"
                    System.out.println("Correct!");
                } else if (randomNumber % 2 == 0 && answer.equalsIgnoreCase(no)) { // число randomNumber является
                    // четным и ответ "no"
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
            } else {
                break;
            }
        }
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
