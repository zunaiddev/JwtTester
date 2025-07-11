package com.example.cmd;

import java.util.Scanner;

public class MainWindow {
    private final Scanner scan = new Scanner(System.in);

    public int mainMenu() {
        System.out.println("""
                ====== Main Menu ======
                Note: Enter -1 anywhere to exit!""");

        System.out.println("""
                pick one option:
                 1. Code Token
                 2. Decode Token""");

        int choice = -1;

        while (true) {
            System.out.print("Enter Your Choice [1:3]: ");

            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input!");
            } finally {
                scan.nextLine();
            }
            if (choice >= -1 && choice < 3) return choice;
            else System.out.println("Invalid Choice!");
        }
    }

    public String decodeMenu() {
        String token;
        System.out.println("\n==== Decode Menu ====");

        System.out.print("Enter JWT Token: ");
        token = scan.nextLine();

        if (token.equals("-1")) return null;
        else return token;
    }

    public String codeMenu() {
        String secretKey;
        System.out.println("\n==== Code Menu ====");

        while (true) {
            System.out.print("Enter Secret Key: ");
            secretKey = scan.nextLine();

            if (secretKey.equals("-1")) return null;

            if (secretKey.length() < 32) System.out.println("Enter a Strong Key: ");
            else return secretKey;
        }
    }
}