package Practice;
import java.util.*;
public class PairWithPrimeProduct {
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        int product = 1;
        boolean found = false;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                product=arr[i]*arr[j];
                if(isPrime(product))
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    found = true;
                }
                
            }
        }
        if(!found)
        {
            System.out.println("-1");
        }
    }
}
