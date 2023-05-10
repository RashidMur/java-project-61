package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
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
        final int numberGreet = 1;
        final int numberEven = 2;
        final int numberCalc = 3;
        final int numberGCD = 4;
        final int numberProgression = 5;
        final int numberPrime = 6;
        final int numberExit = 0;
        switch (choice) {
            case numberGreet :
                Engine.greetings();
                Scanner scannerEven = new Scanner(System.in);
                String userName = scannerEven.next();
                System.out.println("Hello, " + userName + "!");
                break;
            case numberEven :
                Even.even();
                break;
            case numberCalc :
                Calc.calc();
                break;
            case numberGCD :
                Gcd.gcd();
                break;
            case numberProgression :
                Progression.progression();
                break;
            case numberPrime :
                Prime.prime();
            case numberExit :
            default :
        }
        scanner.close();
    }
}
