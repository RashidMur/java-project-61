package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void gcd() {
        Engine.greetings();
        Scanner scannerGcd = new Scanner(System.in);
        String userName = scannerGcd.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        final int minNumber = 1;
        final int maxNumber = 100;
        final int maxNumberRоund = 3;
        int diff = maxNumber - minNumber;
        Scanner scannerGcdAnsver = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i < maxNumberRоund; i++) {
            int randomNumber = random.nextInt(diff + 1);
            int randomNumberNext = random.nextInt(diff + 1);
            randomNumber += minNumber;
            randomNumberNext += minNumber;
            System.out.println("Question: " + randomNumber + " " + randomNumberNext);
            int correctNumb = 1;
            for (int j = 1; j <= randomNumber && j <= randomNumberNext; j++) {
                if (randomNumber % j == 0 && randomNumberNext % j == 0) { // делим обе цифры пока остатки от деления ==0
                    correctNumb = j;
                }
            }
            System.out.print("Your choice: ");
            int userNumb = scannerGcdAnsver.nextInt();
            if (correctNumb == userNumb) {
                Engine.correct();
            } else {
                Engine.wrongNumber(correctNumb, userNumb, userName);
                break;
            }
        }
        Engine.congratulations(i, userName);
    }
}
