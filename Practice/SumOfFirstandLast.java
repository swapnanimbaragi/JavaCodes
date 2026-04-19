package Practice;
import java.util.*;
public class SumOfFirstandLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstDigit=n;
        while(firstDigit>=10)
        {
            firstDigit/=10;
        }
        int lastDigit=n%10;
        int sum=firstDigit+lastDigit;
        System.out.println("Sum of first and last digit"+sum);
    }
}
