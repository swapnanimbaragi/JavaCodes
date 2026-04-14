package Practice;
import java.util.*;
public class PrintPrimeElements {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Prime elements in the array:");
        for(int i=0;i<n;i++)
        {
            if(isPrime(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
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
}
