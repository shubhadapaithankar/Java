package com.company;

public class Employee {
    public String name;
    public int age;
    public String designation;
    public int salary;

    public Employee(String name){
        this.name =name;
    }

    public void empAge(int empAge){
        this.age=empAge;
    }

    public void empDesignation(String empDesignation){
        this.designation=empDesignation;
    }

    public void empSalary(int empSalary){
        this.salary=empSalary;
    }

    public void printEmployee(){
        System.out.println("Name: " +name);
        System.out.println("Age: "  +age) ;
        System.out.println("Designation: "  +designation);
        System.out.println("Salary: " +salary);
    }
}
