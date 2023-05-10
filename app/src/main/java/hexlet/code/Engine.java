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
    public static void wrongAnswer(String answer, String yes, String userName) {
        String answerOpposite;
        String opposite;
        if (answer.equals(yes)) {
            answerOpposite = "'yes'";
            opposite = "'no'";
        } else {
            answerOpposite = "'no'";
            opposite = "'yes'";
        }
        System.out.println(answerOpposite + " is wrong answer ;(. Correct answer was " + opposite  + ".");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void wrongNumber(int correctNumb, int userNumb, String userName) {
        System.out.println("'" + userNumb + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctNumb + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void congratulations(int i, String userName) {
        final int maxNumberRоund = 3;
        if (i == maxNumberRоund) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
