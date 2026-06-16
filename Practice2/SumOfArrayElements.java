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
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                smallest=a[i];
            }
        }
        System.out.println("Smallest element in the array: "+smallest);
    }
}