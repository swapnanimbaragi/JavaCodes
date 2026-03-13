package Encapsulation;

import java.util.Scanner;

public class EmployeeInfo {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String email;
    private String phoneNumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp.setId(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        emp.setName(scanner.nextLine());
        System.out.print("Enter Employee Salary: ");
        emp.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Department: ");
        emp.setDepartment(scanner.nextLine());
        System.out.print("Enter Employee Email: ");
        emp.setEmail(scanner.nextLine());
        System.out.print("Enter Employee Phone Number: ");
        emp.setPhoneNumber(scanner.nextLine());

    }
}

