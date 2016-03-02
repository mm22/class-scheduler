package com.mm;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


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
                "2) View My Courses\n3) Quit\n=============================\n"));
    }

    @Test
    public void shouldReturnUserInput(){
        Scanner input = new Scanner("q");
        assertThat(printer.getUserMenuSelection(input), is(-1));
    }

    @Test
    public void shouldReturnTrueIfNot3(){
        assertTrue(printer.printSelectedMenuOption(2));
    }

    @Test
    public void shouldReturnFalseIfNot3(){
        assertFalse(printer.printSelectedMenuOption(3));
    }

}