package kz.aitu.oop.practice.assignment4.repositories;
/*it is an abstract type that is used to
define the behavior that classes must implement*/

import kz.aitu.oop.practice.assignment4.entities.Employee;
import java.util.List;

public interface IEmployeeRepository { //declared interface
    boolean createEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
   int getSalary(int id);
}