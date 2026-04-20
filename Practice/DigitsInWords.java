package Practice;
import java.util.*;
public class DigitsInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";
        while(n > 0)
        {
            int digit = n % 10;   // get last digit
            result = words[digit] + " " + result;   // get word for digit and add to result
            n = n / 10;   // remove last digit
        }
        System.out.println(result.trim());   
    }
}
