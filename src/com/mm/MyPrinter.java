package com.mm;

import java.util.Scanner;

public class MyPrinter {

    public int getUserMenuSelection(Scanner input){
        printMainMenuOptions();
        System.out.print("Enter the number of the Option you'd like to select:\n");
        int selectedMenuOption = input.nextInt();

        return selectedMenuOption;
    }

    public void printMainMenuOptions() {
        System.out.println("Main Menu");
        System.out.println("=============================");
        System.out.println( "1) Enroll in a Class\n" +
                "2) View My Classes\n3) Quit");
        System.out.println("=============================");
    }
}

