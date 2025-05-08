package com.herve.app.Object;

import java.util.ArrayList;

public class Student {
    // Properties
    private String name;

    private String major;

    private String classYear;

    private String studentId;

    private ArrayList<Integer> studentGrades;

    private int totalSubjects;

    private double averageGrades;

    private int highestGrade;

    private int lowestGrade;

    public double getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(double averageGrades) {
        this.averageGrades = averageGrades;
    }

    public int getHighestGrade() {
        return highestGrade;
    }

    public void setHighestGrade(int highestGrade) {
        this.highestGrade = highestGrade;
    }

    public int getLowestGrade() {
        return lowestGrade;
    }

    public void setLowestGrade(int lowestGrade) {
        this.lowestGrade = lowestGrade;
    }

    // Constructor
    public Student(String name, String major, String classYear, int totalSubjects){
        this.name = name;
        this.major = major;
        this.classYear = classYear;
        this.totalSubjects = totalSubjects;
        this.studentGrades = new ArrayList<>(totalSubjects);
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(ArrayList<Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public int getTotalSubjects() {
        return totalSubjects;
    }

    public void addGrade(int grade) {
        this.studentGrades.add(grade);
    }    
}
