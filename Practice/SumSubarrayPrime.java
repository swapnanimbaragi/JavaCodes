package Practice;
import java.util.*;

public class SumSubarrayPrime {

    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;

        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;   // ✅ added

        for(int size = 1; size <= n; size++)
        {
            for(int i = 0; i <= n - size; i++)
            {
                int sum = 0;

                for(int j = i; j < i + size; j++)
                {
                    sum += a[j];
                }

                if(isPrime(sum))
                {
                    for(int k=i; k<i+size; k++)
                    {
                        System.out.print(a[k] + " ");
                    }
                    return;
                }
            }
        }

        if(min == Integer.MAX_VALUE)
        {
            System.out.println("No prime subarray sum");
        }
        else
        {
            System.out.println(min);
        }
    }
}