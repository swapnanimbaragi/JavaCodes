package ExceptionHandling;
import java.util.*;
public class MultipleFinallyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        try {
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
        finally {
            System.out.println("This will always execute");
        }
    }

}
