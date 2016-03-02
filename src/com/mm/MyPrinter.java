package com.mm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyPrinter {

    public int getUserMenuSelection(Scanner input){
        printMainMenuOptions();
        System.out.print("Enter the number of the Option you'd like to select:\n");
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.next();
            return -1;
        }

    }

    public void printMainMenuOptions() {
        System.out.println("Main Menu");
        System.out.println("=============================");
        System.out.println( "1) Enroll in a Class\n" +
                "2) View My Courses\n3) Quit");
        System.out.println("=============================");
    }

    public boolean printSelectedMenuOption(int userSelectedMenuOption){
        boolean continueAskingForUserInput = true;
        switch (userSelectedMenuOption){
            case -1:
                System.out.println("Please only input valid numbers, not letters.");
                return continueAskingForUserInput;
            case 1 :
                System.out.println("You want to add a class!!!!\n");
                C
                return continueAskingForUserInput;
            case 2 :
                System.out.println("You want to view your classes!!!\n");
                return continueAskingForUserInput;
            case 3:
                System.out.println("BYE BYE");
                continueAskingForUserInput = false;
                return continueAskingForUserInput;
            default:
                System.out.println("Sorry, that is not a valid option :(\n");
                return continueAskingForUserInput;
        }
    }
}

