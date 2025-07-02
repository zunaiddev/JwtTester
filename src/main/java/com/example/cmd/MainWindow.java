package com.example.cmd;

import java.util.Scanner;

public class MainWindow {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String Yellow = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    private final Scanner scan = new Scanner(System.in);

    public int mainMenu() {
        System.out.println(BLUE + "====== Main Menu ======");

        System.out.println("""
                pick one option:
                 1. Code Token
                 2. Decode Token
                 3. Exit""");

        int choice = -1;

        while (true) {
            System.out.print("Enter Your Choice [1:3]: ");

            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                System.out.println(RED + "Invalid Input!");
            } finally {
                scan.nextLine();
            }

            if (choice >= 1 && choice <= 3) return choice;
            else System.out.println(RED + "Invalid Choice!");
        }
    }

    public String decodeMenu() {
        String token;
        System.out.println("==== Decode Menu ====");
        System.out.println("-1 to Exit: ");

        System.out.print("Enter JWT Token: ");
        token = scan.nextLine();

        if (token.equals("-1")) return null;
        else return token;
    }

    public String codeMenu() {
        String secretKey;
        System.out.println("==== Code Menu ====");
        System.out.println("-1 to Exit: ");

        while (true) {
            System.out.print("Enter Secret Key: ");
            secretKey = scan.nextLine();

            if (secretKey.equals("-1")) return null;

            if (secretKey.length() < 32) System.out.println(RED + "Enter a Strong Key: " + RESET);
            else return secretKey;
        }
    }
}