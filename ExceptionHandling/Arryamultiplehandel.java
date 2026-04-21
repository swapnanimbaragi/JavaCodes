package ExceptionHandling;
import java.util.*;
public class Arryamultiplehandel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type");
        }
    }
}
