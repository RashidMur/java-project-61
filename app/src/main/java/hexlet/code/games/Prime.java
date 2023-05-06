package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scannerPrimeName = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userNamePrime = scannerPrimeName.next();
        System.out.println("Hello, " + userNamePrime + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String yes = "yes";
        String no = "no";
        int min = 2;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i;
        for (i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(diff + 1);
            randomNumber += min;
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scannerPrimeName.next();
            int sum = 0;
            for (int j = 1; j <= randomNumber; j++) {
                if (randomNumber % j == 0) {
                    sum++;
                }
            }
            if (answer.equalsIgnoreCase(yes) || answer.equalsIgnoreCase(no)) { // ответ должен быть либо "yes"
                // либо "no", при другом значении игра останавливается
                if (sum == 2 && answer.equalsIgnoreCase(yes)) {
                    System.out.println("Correct!");
                } else if (sum > 2 && answer.equalsIgnoreCase(yes)) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userNamePrime + "!");
                    break;
                } else if (sum > 2 && answer.equalsIgnoreCase(no)) {
                    System.out.println("Correct!");
                } else if (sum == 2 && answer.equalsIgnoreCase(no)) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userNamePrime + "!");
                    break;
                }
            } else {
                break;
            }
        }
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userNamePrime + "!");
        }
    }
}
