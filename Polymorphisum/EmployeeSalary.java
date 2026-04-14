package Polymorphisum;
import java.util.Scanner;
class Employee
{
    void salary()
    {
        System.out.println("Employee has a salary");
    }
}
class Manager extends Employee
{
    void salary()
    {
        System.out.println("Manager has a salary of 50000");
    }
}
class Developer extends Employee
{
    void salary()
    {
        System.out.println("Developer has a salary of 40000");
    }
}
public class EmployeeSalary 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Employee e;
        if(str.equals("Manager"))
        {
            e=new Manager();
            e.salary();
        }
        else if(str.equals("Developer"))
        {
            e=new Developer();
            e.salary();
        }
        else
        {
            System.out.println("Unknown employee");
        }
    }
}
