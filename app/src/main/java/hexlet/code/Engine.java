package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void greetings(String condition, String[][] questionAnswer) {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
        int maxNumberRound = 3;
        int i;
        for (i = 0; i < maxNumberRound; i++) {
            Scanner scannerAnswer = new Scanner(System.in);
            System.out.println("Question: " + questionAnswer[i][0]);
            System.out.print("Your choice: ");
            String userAnswer = scannerAnswer.next();
            if (userAnswer.equals(questionAnswer[i][1])) {
                System.out.println("Correct!");
            } else  {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
                System.out.println("Correct answer was " + "'" + questionAnswer[i][1] + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (i == maxNumberRound) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
