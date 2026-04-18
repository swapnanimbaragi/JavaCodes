package Practice;
import java.util.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product=1;
        while(n>0)
        {
            int digit=n%10;
            product*=digit;
            n/=10;
        }
        System.out.println(product);
    }
}
