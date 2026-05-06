package Practice;
import java.util.*;

public class EvenSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int size=1;size<=n;size++)
        {
            for(int i=0;i<=n-size;i++)
            {
                int sum = 0;

                // calculate full subarray sum
                for(int j=i;j<i+size;j++)
                {
                    sum += arr[j];   
                }

                // check even sum
                if(sum % 2 == 0)
                {
                    // print subarray
                    for(int j=i;j<i+size;j++)
                    {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}