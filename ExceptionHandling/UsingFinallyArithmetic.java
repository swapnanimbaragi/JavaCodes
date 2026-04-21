package ExceptionHandling;
import java.util.*;
public class UsingFinallyArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        try {
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This block will always execute");
        }
    }
}
