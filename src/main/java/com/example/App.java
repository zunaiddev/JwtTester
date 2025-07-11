package com.example;

import com.example.cmd.MainWindow;

public class App {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        while (true) {
            int choice = mainWindow.mainMenu();

            switch (choice) {
                case 1:
                    String c = mainWindow.codeMenu();

                    if (c == null) return;
                case 2:
                    String token = mainWindow.decodeMenu();
                    if (token == null) return;

                case -1:
                    return;
            }
        }
    }
}
