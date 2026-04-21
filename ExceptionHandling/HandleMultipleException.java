package ExceptionHandling;
import java.util.*;

public class HandleMultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int numeratore = sc.nextInt();
            int denominatore = sc.nextInt();

            int result = numeratore / denominatore;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type");
        }
    }
}