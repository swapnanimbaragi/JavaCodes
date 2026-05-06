package Practice;
import java.util.*;
public class CountLesserThanKPrime {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(isPrime(arr[i]) && arr[i]<k)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
