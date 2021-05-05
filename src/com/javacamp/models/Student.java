package com.javacamp.models;

public class Student extends User{

    private int studentId;
    private String schoolName;
    private int progressScore;




    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getProgressScore() {
        return progressScore;
    }

    public void setProgressScore(int progressScore) {
        this.progressScore = progressScore;
    }
}
