package hexlet.code;


public class Engine {
    public static void greetings() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }
    public static void correct() {
        System.out.println("Correct!");
    }
    public static void wrongAnswer(String answer, String userName) {
        if (answer.equals("yes")) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'no'" + ".");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'yes'" + ".");
        }
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void wrongNumber(int correctNumb, int userNumb, String userName) {
        System.out.println("'" + userNumb + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctNumb + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void congratulations(int i, String userName) {
        final int maxNumberRound = 3;
        if (i == maxNumberRound) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
