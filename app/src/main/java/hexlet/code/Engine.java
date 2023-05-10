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
        String answerNo;
        String opposite;
        if (answer.equals(yes)) {
            answerNo = "'yes'";
            opposite = "'no'";
        } else {
            answerNo = "'no'";
            opposite = "'yes'";
        }
        System.out.println(answerNo + " is wrong answer ;(. Correct answer was " + opposite  + ".");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void wrongNumber(int correctNumb, int userNumb, String userName) {
        System.out.println("'" + userNumb + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctNumb + "'");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void congratulations(int i, String userName) {
        if (i == 3) { // если счетчик цикла for становится равен 3 то
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
