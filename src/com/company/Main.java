package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {



    public static void main(String[] args) {
        Student newStudent = new Student();
        ArrayList<Student> newGroup = new ArrayList<Student>();
        newGroup.add(newStudent.newStudent("Max", 123141566));
        newGroup.add(newStudent.newStudent("Lolo", System.currentTimeMillis()));
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime("");
    }

}
