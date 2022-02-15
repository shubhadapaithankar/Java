package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee emp1 = new Employee("shubhada");
        Employee emp2 = new Employee("vinit");


        emp1.empAge(26);
        emp1.empDesignation("SRE");
        emp1.empSalary(10000);
        emp1.printEmployee();

        emp2.empAge(30);
        emp2.empDesignation("Software Engineer");
        emp2.empSalary(50000000);
        emp2.printEmployee();


    }
}
