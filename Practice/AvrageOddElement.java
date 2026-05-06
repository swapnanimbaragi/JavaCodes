package Practice;
import java.util.*;
public class AvrageOddElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                sum=sum+arr[i];
                count++;
            }
        }
        if(count>0)
        {
            double average=(double)sum/count;
            System.out.printf("Average of odd elements: "+String.format("%.2f", average));
        }
        else
        {
            System.out.println("No odd elements found.");
        }

    }
}
