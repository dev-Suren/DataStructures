package com.nestedclasswithinterface;

import java.util.Scanner;

public class Student implements StudentInterface.StudentIds{

    @Override
    public int studentId(StudentDetails studentDetails) {
        return studentDetails.getStudentId();
    }

    class NewStudents implements StudentInterface {
        @Override
        public String studentName(StudentDetails studentDetails) {
            return  studentDetails.getStudentName();
        }


    }


}
