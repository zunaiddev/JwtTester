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
                case 2:
                    mainWindow.decodeMenu();
                case 3:
                    return;
            }
        }
    }
}
