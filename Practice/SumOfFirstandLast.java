package Practice;
import java.util.*;

public class SumOfFirstandLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int last = n % 10;   // last digit

        int first = n;
        while(first >= 10)
        {
            first = first / 10;   // keep removing last digit
        }

        int sum = first + last;

        System.out.println(sum);
    }
}