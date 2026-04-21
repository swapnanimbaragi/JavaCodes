package ExceptionHandling;
import java.util.*;
public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            System.out.println("The number is: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type");
        }
    }
}
