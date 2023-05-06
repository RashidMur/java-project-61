package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scannerProgName = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userNameProg = scannerProgName.next();
        System.out.println("Hello, " + userNameProg + "!");
        System.out.println("What number is missing in the progression?");
        int min = 5;
        int max = 10;
        int diff = max - min;
        Scanner scannerProgAnsver = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i < 3; i++) {
            int randomLongArr = random.nextInt(diff + 1);
            int randomStep = random.nextInt(diff + 1);
            randomLongArr += min;
            randomStep += min;
            int min1 = 1;
            int max1 = 50;
            int diff1 = max1 - min1;
            Random random1 = new Random();
            int startNumder = random1.nextInt(diff1 + 1);
            int[] arr = new int[randomLongArr];
            arr[0] = startNumder;
            for (int j = 1; j <= arr.length - 1; j++) {
                arr[j] = arr[j - 1] + randomStep;
            }
            int ranNumder = random1.nextInt(randomLongArr - 1);
            System.out.print("Question: ");
            for (int j = 0; j < arr.length; j++) {
                if (j == ranNumder) {
                    System.out.print(".." + " ");
                } else if (j == randomLongArr - 1) {
                    System.out.println(arr[j]);
                } else {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.print("Your choice: ");
            int userNumber = scannerProgAnsver.nextInt();
            if (arr[ranNumder] == userNumber) { // если число correctProg равно числу Prog
                System.out.println("Correct!");
            } else {
                System.out.println(userNumber + " is wrong answer ;(. Correct answer was " + arr[ranNumder]);
                System.out.println("Let's try again, " + userNameProg + "!");
                break;
            }
        }
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userNameProg + "!");
        }
    }
}
