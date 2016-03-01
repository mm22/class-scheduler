package com.mm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continueAskingForUserInput = true;
        Scanner readUserInput = new Scanner(System.in);

        MyPrinter printer = new MyPrinter();

        while (continueAskingForUserInput) {
            int userSelectedMenuOption = printer.getUserMenuSelection(readUserInput);
            switch (userSelectedMenuOption){
                case 1 :
                    System.out.println("You want to add a class!!!!");
                    break;
                case 2 :
                    System.out.println("You want to view your classes!!!");
                    break;
                case 3:
                    System.out.println("BYE BYE");
                    continueAskingForUserInput = false;
                    break;
                default:
                    System.out.println("Sorry, that is not a valid option :(");
            }
        }
    }
}
