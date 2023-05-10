package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Engine.greetings();
        Scanner scannerProg = new Scanner(System.in);
        String userName = scannerProg.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");
        final int minNumber = 5;
        final int maxNumber = 10;
        final int maxNumberRоund = 3;
        int diff = maxNumber - minNumber;
        Scanner scannerProgAnsver = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i < maxNumberRоund; i++) {
            int randomLongArr = random.nextInt(diff + 1); // рандомный размер массива
            int randomStep = random.nextInt(diff + 1); // рандомный шаг прогрессии
            randomLongArr += minNumber;
            randomStep += minNumber;
            final int minNumberArr = 1;
            final int maxNumberArr = 50;
            int diff1 = maxNumberArr - minNumberArr;
            Random randomStartArr = new Random();
            int startNumder = randomStartArr.nextInt(diff1 + 1);
            int[] arr = new int[randomLongArr];
            arr[0] = startNumder;
            for (int j = 1; j <= arr.length - 1; j++) { // строим арифмитическую прогрессию и записываем в массив
                arr[j] = arr[j - 1] + randomStep;
            }
            int ranNumder = randomStartArr.nextInt(randomLongArr - 1); // рандомное число в рамках массива
            System.out.print("Question: ");
            for (int j = 0; j < arr.length; j++) {
                if (j == ranNumder) { // замена рандомного числа на ".."
                    System.out.print(".." + " ");
                } else if (j == randomLongArr - 1) { // если доходим до конца массива то печаем с переносом строки
                    System.out.println(arr[j]);
                } else { // иначе то печатаем без переноса с пробелом
                    System.out.print(arr[j] + " ");
                }
            }
            int correctNumb = arr[ranNumder];
            System.out.print("Your choice: ");
            int userNumb = scannerProgAnsver.nextInt();
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
