package ExceptionHandling;
import java.util.*;
public class NegtiveSizeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        try {
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Cannot create array of negative size");
        }
    }
}
