package Practice;
import java.util.*;

public class PrimeProductSubarray {

    public static boolean isPrime(int n)
    {
        if(n <= 1) 
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int product = 1;

            for(int j = i; j < n; j++)
            {
                product *= a[j];

                int length = j - i + 1;

                if(length > size && isPrime(product))
                {
                    for(int k = i; k <= j; k++)
                    {
                        System.out.print(a[k] + " ");
                    }
                    return; 
                }
            }
        }

        System.out.println("None");
    }
}