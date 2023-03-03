package com.nestedclasswithinterface;

public class StudentDetails {
    private String studentName;
    private int studentId;

    public StudentDetails(String studentName, int studentId){
        this.studentId= studentId;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
}
