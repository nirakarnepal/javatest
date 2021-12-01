package day5;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee0 = new Employee();
        //Using setters
        employee0.setName("John11");
        employee0.setSalary(100011);
        employee0.setAge(30);
        employee0.setHireDate(LocalDate.of(2019, 1, 1));

        Employee employee1 = new Employee("John", 100000, 22, LocalDate.now());
        Employee employee2 = new Employee(null, 999990, 28, LocalDate.now());

        employee0.printEmployee();
        employee1.printEmployee();
        employee2.printEmployee();

        employee2.raiseSalary(10);
        employee2.printEmployee();

    }
}
