package day5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private LocalDate hireDate;
    private String race; //opt

    //Default constructor
    public Employee() {

    }

    //Parameterized constructor
    public Employee(String name, double salary, int age, LocalDate hireDate) {
        //Objects helper class
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.age = age;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }

    //Overloading
    public Employee(String name, double salary, int age, LocalDate hireDate, String race) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.hireDate = hireDate;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    //raise salary
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("Hire date: " + hireDate);
        System.out.println("------------------------------");
    }

}


