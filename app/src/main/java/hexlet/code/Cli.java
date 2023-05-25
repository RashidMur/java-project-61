package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static void greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scannerGreet = new Scanner(System.in);
        String userName = scannerGreet.next();
        System.out.println("Hello, " + userName + "!");
    }

}
