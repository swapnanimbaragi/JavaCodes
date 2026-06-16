import java.util.*;
public class SumOfArrayElements {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        //Sum of array elements
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=a[i];
        // }
        // System.out.println("Sum of array elements: "+sum);

        //largest element in the array
        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]>largest)
        //     {
        //         largest=a[i];
        //     }
        // }
        // System.out.println("Largest element in the array: "+largest);

        //smallest element in the array
        // int smallest=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]<smallest)
        //     {
        //         smallest=a[i];
        //     }
        // }
        // System.out.println("Smallest element in the array: "+smallest);

        // reverse of the array
        // for(int i=n-1;i>=0;i--)
        // {
        //     System.out.print(a[i]+" ");
        // }

        int evenCount=0;
        int OddCount=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                OddCount++;
            }
        }
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd count: "+OddCount);
    }
}