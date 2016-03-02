package com.mm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassesListTest {

    @Test
    public void shouldAddClass(){
        ClassesList classesList = new ClassesList();
        classesList.addClass("Java 101");
        int previousNumberOfClasses = classesList.getNumberOfCourses();
        classesList.addClass("C++ 211");
        assertEquals(previousNumberOfClasses+1, classesList.getNumberOfCourses());
    }


    @Test
    public void shouldReturnClassSize(){
        ClassesList classesList = new ClassesList();
        classesList.addClass("Java for Beginners");
        classesList.addClass("LUA for Dummies");
        assertEquals(2, classesList.getNumberOfCourses());
    }

//    @Test
//    public void shouldReturnAllClassesByName(){
//        ClassesList classesList = new ClassesList();
//        classesList.addClass("Staying Awake 101");
//        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Staying Awake 101"));
//        assertEquals(expected, classesList.getNumberOfCourses());
//    }
}