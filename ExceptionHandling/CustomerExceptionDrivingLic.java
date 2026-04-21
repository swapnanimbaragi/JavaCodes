package ExceptionHandling;
import java.util.*;

// Custom Exception 1
class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }
}

// Custom Exception 2
class OverAgeException extends Exception {
    public OverAgeException(String msg) {
        super(msg);
    }
}

public class CustomerExceptionDrivingLic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if(age < 18) {
                throw new UnderAgeException("You are too young. Have patience!");
            } 
            else if(age > 60) {
                throw new OverAgeException("You are too old. Cool down!");
            }
            else {
                System.out.println("Eligibility confirmed: You can apply for a driving license.");
            }
        } 
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } 
        catch (OverAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}