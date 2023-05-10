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
        switch (choice) {
            case 1 :
                Engine.greetings();
                Scanner scannerEven = new Scanner(System.in);
                String userName = scannerEven.next();
                System.out.println("Hello, " + userName + "!");
                break;
            case 2 :
                Even.even();
                break;
            case 3 :
                Calc.calc();
                break;
            case 4 :
                Gcd.gcd();
                break;
            case 5 :
                Progression.progression();
                break;
            case 6 :
                Prime.prime();
            case 0 :
            default :
        }
        scanner.close();
    }
}
