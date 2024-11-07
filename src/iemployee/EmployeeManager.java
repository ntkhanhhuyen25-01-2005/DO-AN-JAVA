/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iemployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeManager {

    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        employees.forEach((employee) -> {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.calculateSalary());
        });
    }

    public double totalFullTimeSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                total += employee.calculateSalary();
            }
        }

        return total;
    }

    public void sortEmployeesByName() {
        Collections.sort(employees, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Show Total Salary of Full-Time Employees");
            System.out.println("4. Sort Employees by Name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Enter Employee type (1: Part-Time, 2: Full-Time): ");
                    int c = sc.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Payment Per Hour: ");
                    int paymentPerHour = scanner.nextInt();

                    if (c == 1) {
                        System.out.print("Enter Working Hours: ");
                        int workingHours = scanner.nextInt();
                        PartTimeEmployees part = new PartTimeEmployees( workingHours,name,paymentPerHour);
                        addEmployee(part);
                    } else if (c == 2) {
                        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, paymentPerHour);
                        addEmployee(fullTimeEmployee);
                    }
                    break;
                case 2:
                    showAllEmployees();
                    break;
                case 3:
                    System.out.println("Show Total Full-Time Salary: " + totalFullTimeSalary());
                    break;
                case 4:
                    sortEmployeesByName();
                    System.out.println("sort Employees  by name.");
                    showAllEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("loi vui long nhap lai !!!");
            }
        }
    }
}
