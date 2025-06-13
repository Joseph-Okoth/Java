// Instance variabls are declared in a class, but outside a method, constructor or any block

import java.io.*;

public class Employee{
    //This instance variable is visible for any child class
    public String name;

    //salary variable is visible in Employee class only
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee (String empName){
        name = empName;
    }

    //The salary variable is assigned a value
    public void setSalary(double empSal){
        salary = empSal;
    }

    //THis method prints the employee details.
    public void main(String args[]){
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}