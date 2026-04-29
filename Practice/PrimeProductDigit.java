package Practice;
import java.util.*;
public class PrimeProductDigit 
{
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

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int product=1;
        while(n>0)
        {
            int last= n%10;
            if(isPrime(last))
            {
                product= product*last;
            }
            n=n/10;
        }
        if(isPrime(product))
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Not Prime");
        }
    }
}
