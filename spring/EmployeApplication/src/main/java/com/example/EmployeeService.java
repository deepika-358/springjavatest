package com.example;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void addEmployee() {
        System.out.println("Employee added: Deepika");
    }

    public void displayEmployee() {
        System.out.println("Employee ID: 308");
        System.out.println("Employee Name: Deepika");
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: 25000.0");
   
}

}

