package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int NUMBER_GREET = 1;
    public static final int NUMBER_EVEN = 2;
    public static final int NUMBER_CALC = 3;
    public static final int NUMBER_GCD = 4;
    public static final int NUMBER_PROGRESSION = 5;
    public static final int NUMBER_PRIME = 6;
    public static final int NUMBER_EXIT = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case NUMBER_GREET :
                Cli.greeting();
                break;
            case NUMBER_EVEN :
                Even.even();
                break;
            case NUMBER_CALC :
                Calc.calc();
                break;
            case NUMBER_GCD :
                Gcd.gcd();
                break;
            case NUMBER_PROGRESSION :
                Progression.progression();
                break;
            case NUMBER_PRIME :
                Prime.prime();
            case NUMBER_EXIT :
            default :
        }
        scanner.close();
    }
}
