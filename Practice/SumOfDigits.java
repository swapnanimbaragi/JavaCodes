package Practice;
import java.util.*;
public class SumOfDigits {
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n/=10;
            
        }
        if(isPrime(sum))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        
    }
}
