package com.mm;

public class Courses implements Comparable<Courses>{
    private String name;
    private int enrolledStudents;

    public Courses(String name) {
        this.name = name;
        enrolledStudents = 0;
    }

    public String getName() {
        return name;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Courses course) {
        return this.name.compareTo(course.getName());
    }
}
