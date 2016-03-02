package com.mm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continueAskingForUserInput = true;
        Scanner readUserInput = new Scanner(System.in);

        MyPrinter printer = new MyPrinter();

        while (continueAskingForUserInput) {
            int userSelectedMenuOption = printer.getUserMenuSelection(readUserInput);
            continueAskingForUserInput = printer.printSelectedMenuOption(userSelectedMenuOption);
        }
    }
}
