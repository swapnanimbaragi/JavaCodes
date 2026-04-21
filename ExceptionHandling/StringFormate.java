package ExceptionHandling;
import java.util.*;
public class StringFormate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = sc.nextInt();
        try {
            String result = String.format("%c", input.charAt(index));
            System.out.println(result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
