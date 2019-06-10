package org.launchcode.java.demos;

public class Student {
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    private void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa(double gpa) {
        return this.gpa;
    }

}
