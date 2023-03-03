package com.nestedclasswithinterface;

public interface StudentInterface {
    interface StudentIds{
        int studentId(StudentDetails studentDetails);
    }
    String studentName(StudentDetails studentDetails);

}
