package kz.aitu.oop.practice.assignment4;

import kz.aitu.oop.practice.assignment4.controllers.EmployeeController;
import kz.aitu.oop.practice.assignment4.repositories.IEmployeeRepository;

import java.util.Scanner;

public class EmployeeFrontend {
    private final EmployeeController controller;
    private final Scanner scanner;

    public EmployeeFrontend(IEmployeeRepository employeeRepository) {
        controller = new EmployeeController(employeeRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employee");
            System.out.println("2. Get employee by id");
            System.out.println("3. Create employee");
            System.out.println("4. Total cost");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllEmployeesMenu();
                } else if (option == 2) {
                    getEmployeeByIdMenu();
                } else if (option == 3) {
                    createEmployeeMenu();
                } else if (option == 4) {
                    getSalary();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    public void getAllEmployeesMenu() {
        String response = controller.getAllEmployees();
        System.out.println(response);
    }

    public void getEmployeeByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getEmployee(id);
        System.out.println(response);
    }

    public void getSalary() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getSalary(id);
        System.out.println(response);
    }

    public void createEmployeeMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter gender (male/female)");
        String gender = scanner.next();
        System.out.println("Please enter department");
        int dep_id = scanner.nextInt();

        String response = getString(name, surname, gender, dep_id);
        System.out.println(response);
    }

    private String getString(String name, String surname, String gender, int dep_id) {
        String response = controller.createEmployee(name, surname, gender, dep_id);
        return response;
    }
}
