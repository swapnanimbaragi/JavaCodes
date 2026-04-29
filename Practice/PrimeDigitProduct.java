package Practice;
import java.util.*;
public class PrimeDigitProduct {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int product=1;
        boolean found=false;
        while(n>0)
        {
            int digit=n%10;
            if(isPrime(digit))
            {
                product*=digit;
                found=true;
            }
            n=n/10;
        }
        if(found)
        {
            System.out.print("Product Of Digit"+product);
        }
        else{
            System.out.print("No prime number.");
        }
    }
}
