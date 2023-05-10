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
        int min = 5;
        int max = 10;
        int diff = max - min;
        Scanner scannerProgAnsver = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i < 3; i++) {
            int randomLongArr = random.nextInt(diff + 1); // рандомный размер массива
            int randomStep = random.nextInt(diff + 1); // рандомный шаг прогрессии
            randomLongArr += min;
            randomStep += min;
            int min1 = 1;
            int max1 = 50;
            int diff1 = max1 - min1;
            Random random1 = new Random();
            int startNumder = random1.nextInt(diff1 + 1);
            int[] arr = new int[randomLongArr];
            arr[0] = startNumder;
            for (int j = 1; j <= arr.length - 1; j++) { // строим арифмитическую прогрессию и записываем в массив
                arr[j] = arr[j - 1] + randomStep;
            }
            int ranNumder = random1.nextInt(randomLongArr - 1); // рандомное число в рамках массива
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
