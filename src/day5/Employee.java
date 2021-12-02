package day5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private LocalDate hireDate;
    private String race; //opt
    private String socialSecurityNumber;
    public static int count = 0;

    //Default constructor
    public Employee() {

    }

    //Parameterized constructor
    public Employee(String name, double salary, int age, String socialSecurityNumber, LocalDate hireDate) {
        //Objects helper class
        this.count++;
        this.name = Objects.requireNonNullElse(name, "Unknown");
        this.salary = salary;
        this.age = age;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
        this.socialSecurityNumber = Objects.requireNonNullElse(socialSecurityNumber, "Unknown");
    }

    //Overloading
    public Employee(String name, double salary, int age, LocalDate hireDate, String socialSecurityNumber, String race) {
        this.count++;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.hireDate = hireDate;
        this.socialSecurityNumber=socialSecurityNumber;
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


    public void setAge(int age) {
        this.age = age;
    }


    //raise salary
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
        System.out.println("Hire date: " + this.hireDate);
        System.out.println("------------------------------");
    }

}


