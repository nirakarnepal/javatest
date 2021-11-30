package day5;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private LocalDate hireDate;

    //Default constructor
    public Employee(){

    }

    //Parameterized constructor
    public Employee(String name, double salary, int age, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.hireDate = hireDate;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

    public LocalDate getHireDate(){
        return hireDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }


    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("Hire date: " + hireDate);
        System.out.println("------------------------------");
    }

}


