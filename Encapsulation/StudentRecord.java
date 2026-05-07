package Encapsulation;
import java.util.Scanner;
public class StudentRecord {
    private String studentName;
    private int studentId;
    private double gpa;

    public String getStudentName() 
    {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        Scanner scanner = new Scanner(System.in);
        
        String studentName=scanner.nextLine();
        int studentId=scanner.nextInt();
        double gpa=scanner.nextDouble();
        
        student.setStudentName(studentName);
        student.setStudentId(studentId);
        student.setGpa(gpa);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("GPA: " + student.getGpa());
    }
}
