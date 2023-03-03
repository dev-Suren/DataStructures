package com.lambdaexpression;

public class Functions {
    public void printEmployeeDetails(Departments departments){
        String list = departments.getEmpList().stream().map(e->printList(e)).toString();
    }

    public String printList(Employee employee){
        return "Id: "+employee.getID()+" Name: "+employee.getName()+" Salary: "+employee.getSalary();
    }
}
