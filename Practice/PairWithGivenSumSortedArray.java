package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class PairWithGivenSumSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=scanner.nextInt();
        // Implementation for finding pair with given sum in sorted array
        for(int i=0;i<n-1;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                if(arr[i]+arr[j]==sum) 
                {
                    System.out.println("Yes");
                    return;
                }
            }
        }
         System.out.println("No pair found with the given sum.");
    }
         
}
