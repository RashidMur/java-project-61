package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1 :
                Scanner scannerCase1 = new Scanner(System.in);

                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scannerCase1.next();
                System.out.println("Hello, " + userName + "!");
                break;
            case 2 :
                Even.even();
            case 0 :
            default :
        }
        scanner.close();
    }
}
