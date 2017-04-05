package com.company;

/**
 * Created by student on 05.04.2017.
 */
public class Student {
    private String name;
    private long dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student newStudent(String name, long dateOfBirth){
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setDateOfBirth(dateOfBirth);
        return newStudent;
    }
}
