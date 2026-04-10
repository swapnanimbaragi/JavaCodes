package Practice;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // ✅ FIX 1
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }

        // ✅ FIX 2
        int totalSum= max*(max+1)/2;

        System.out.print(totalSum-sum);
    }
}