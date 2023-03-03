package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class Departments {
    private String manager;
    private int managerSalary;
    private List<Employee> empList = new ArrayList<Employee>();

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
