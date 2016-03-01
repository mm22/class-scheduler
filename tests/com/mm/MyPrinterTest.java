package com.mm;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class MyPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    MyPrinter printer = new MyPrinter();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintMainMenu(){
        printer.printMainMenuOptions();
        assertThat( outContent.toString(), is("Main Menu\n=============================\n1) Enroll in a Class\n" +
                "2) View My Classes\n3) Quit\n=============================\n"));
    }

    @Test
    public void shouldReturnUserInput(){
        Scanner input = new Scanner("1");
        assertThat(printer.getUserMenuSelection(input), is(1));
    }

}