package org.launchcode.java.demos;

import java.util.ArrayList;

public class Course {
    private String name;
    //private int numberOfSeats;
    private ArrayList<Student> roster;
    //private String courseDescription;
    //private ArrayList<Instructor> instructor; //don't have Instructor object yet
    private String number;
    //private ArrayList<HashMap<Student, double>> grades;

    public Course(String name, String number) {
        this.name = name;
        this.number = number;
        this.roster = new ArrayList<>();
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
