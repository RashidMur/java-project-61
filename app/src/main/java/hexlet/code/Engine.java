package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_ROUND = 3;

    public static void engineRun(String condition, String[][] questionAnswer) {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
        for (String[] questionAnswers : questionAnswer) {
            System.out.println("Question: " + questionAnswers[0]);
            System.out.print("Your choice: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(questionAnswers[1])) {
                System.out.println("Correct!");
            } else  {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
                System.out.println("Correct answer was " + "'" + questionAnswers[1] + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
