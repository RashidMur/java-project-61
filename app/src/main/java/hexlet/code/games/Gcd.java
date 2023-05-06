package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void gcd() {
        Scanner scannerGcdName = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userNameGcd = scannerGcdName.next();
        System.out.println("Hello, " + userNameGcd + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        int min = 1;
        int max = 100;
        int diff = max - min;
        Scanner scannerGcdAnsver = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            randomNumber += min;
            randomNumberNext += min;
            System.out.println("Question: " + randomNumber + " " + randomNumberNext);
            int correctGcd = 1;
            for (int j = 1; j <= randomNumber && j <= randomNumberNext; j++) {
                if (randomNumber % j == 0 && randomNumberNext % j == 0) {
                    correctGcd = j;
                }
            }
            System.out.print("Your choice: ");
            int gcd = scannerGcdAnsver.nextInt();
            if (correctGcd == gcd) { // если число correctGcd равно числу gcd то
                System.out.println("Correct!");
            } else {
                System.out.println(gcd + " is wrong answer ;(. Correct answer was " + correctGcd);
                System.out.println("Let's try again, " + userNameGcd + "!");
                break;
            }
        }
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userNameGcd + "!");
        }
    }
}
