package Practice;
import java.util.*;

public class PrimeSumSubarray {

    public static boolean isPrime(int num)
    {
        if(num <= 1) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int maxLen = 0;
        int start = 0, end = 0;

        for(int size=1;size<=n;size++)
        {
            for(int i=0;i<=n-size;i++)
            {
                int sum = 0;

                for(int j=i;j<i+size;j++)
                {
                    sum += arr[j];
                }

                if(isPrime(sum) && size > maxLen)
                {
                    maxLen = size;
                    start = i;
                    end = i + size - 1;
                }
            }
        }

        // print longest subarray
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}