package com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId()           { return id; }
    public String getName()      { return name; }
    public String getDepartment(){ return department; }
    public double getSalary()    { return salary; }

    // Setters
    public void setId(int id)                  { this.id = id; }
    public void setName(String name)           { this.name = name; }
    public void setDepartment(String dept)     { this.department = dept; }
    public void setSalary(double salary)       { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee ID  : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);
        System.out.printf("Salary       : ₹%.2f%n", salary);
    }
}
