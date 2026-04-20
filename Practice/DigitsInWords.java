package Practice;
import java.util.*;
public class DigitsInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
            int digit = n % 10;
            sb.insert(0, words[digit] + " ");
            n = n / 10;
        }
        System.out.println(sb.toString().trim());
    }
}
