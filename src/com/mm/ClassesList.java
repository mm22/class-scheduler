package com.mm;

import java.util.ArrayList;
import java.util.List;

public class CoursesList{
    List allClasses = new ArrayList<Courses>();

    public void addClass(String name) {
        allClasses.add(new Courses(name));
    }

    public int getNumberOfCourses() {
        return allClasses.size();
    }

    public List getAllCourses() {
        return allClasses;
    }


}
