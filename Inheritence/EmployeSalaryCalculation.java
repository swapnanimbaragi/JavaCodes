package Inheritence;
import java.util.*;
class Employee
{
    private String name;
    private double  Salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getAnnualSalary() {
        return Salary*12;
    }

}
class Manager extends Employee
{
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getAnnualSalary() {
        return (super.getAnnualSalary() + bonus);
    }
    
}
class Engineer extends Employee
{
    private double overtimePay;

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public double getAnnualSalary() {
        return (super.getAnnualSalary() + overtimePay);
    }
}
public class EmployeSalaryCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.next().trim();
        scan.nextLine();  // important

        if (type.equals("Manager")) 
        {
            String[] data = scan.nextLine().split(",");
            Manager m = new Manager();
            m.setName(data[0]);
            m.setSalary(Double.parseDouble(data[1]));
            m.setBonus(Double.parseDouble(data[2]));

            System.out.printf("Annual Salary of Manager: %.2f", m.getAnnualSalary());
        }
        else if (type.equals("Engineer")) {
            String[] data = scan.nextLine().split(",");
            Engineer e = new Engineer();
            e.setName(data[0]);
            e.setSalary(Double.parseDouble(data[1]));
            e.setOvertimePay(Double.parseDouble(data[2]));

            System.out.printf("Annual Salary of Engineer: %.2f", e.getAnnualSalary());
        }
    }
}
