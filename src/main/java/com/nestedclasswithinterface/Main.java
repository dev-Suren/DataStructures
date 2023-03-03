package com.nestedclasswithinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)throws IOException {
        Student student = new Student();
        Student.NewStudents newStudents = new Student().new NewStudents();
        int x = 0;
        List<StudentDetails> list= new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while( x <= 5){
            System.out.println("take name");
            String name = bufferedReader.readLine();
            System.out.println("take id");
            int id = Integer.parseInt(bufferedReader.readLine());
            StudentDetails studentDetails = new StudentDetails(name,id);
            list.add(studentDetails);
            x++;
        }

        for(StudentDetails stu : list){
            System.out.println("The name of the sutdent is "+newStudents.studentName(stu)+" and Student Id is "+ student.studentId(stu));
        }


    }
}
