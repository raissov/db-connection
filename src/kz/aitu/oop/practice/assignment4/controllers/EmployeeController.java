package kz.aitu.oop.practice.assignment4 .controllers;

import kz.aitu.oop.practice.assignment4.entities.Employee;
import kz.aitu.oop.practice.assignment4.repositories.IEmployeeRepository;

import java.util.List;

public class EmployeeController {
    /*Controller is a class designed to directly handle
    requests from the client and return results*/
    private final IEmployeeRepository repo;

    public EmployeeController(IEmployeeRepository repo) {
        this.repo = repo;
    }

    public String createEmployee(String name, String surname, String gender, int dep_id) {
        Employee employee = new Employee(name, surname, gender, dep_id);

        boolean created = repo.createEmployee(employee);
        /* what we accept from the client*/

        return (created ? "Employee was created!" : "Employee creation was failed!");
        /*what we output to the client*/
    }

    public String getEmployee(int id) {
        Employee employee = repo.getEmployee(id);
        /* what we accept from the client*/

        return (employee == null ? "Employee was not found!" : employee.toString());
        /*what we output to the client*/
    }

    public String getAllEmployees() {
        List<Employee> employees = repo.getAllEmployees();

        return employees.toString();
    }

    public String getSalary(int id) {
        int salary = repo.getSalary(id);
        /* what we accept from the client*/

        return (salary == 0 ? "department was not found!" : String.valueOf(salary));
        /*what we output to the client*/
    }
}