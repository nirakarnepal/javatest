package day5;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        //Using setters
        employee.setName("John11");
        employee.setSalary(100011);
        employee.setAge(30);
        employee.setHireDate(LocalDate.of(2019, 1, 1));
        employee.printEmployee();


        Employee employee1 = new Employee("John", 100000, 22, LocalDate.now());
        employee1.printEmployee();

    }
}
