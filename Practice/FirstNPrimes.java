package Practice;   
import java.util.*;
class FirstNPrimes
{
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
        int m=sc.nextInt();
        int count=0;
        for(int i=m+1;count<n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
                count++;
                
            }
        }

    }
}   