package Practice;
import java.util.Scanner;   
public class secondLargestDivisible {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt(); // Divisor 
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                if(arr[i]>largest)
                {
                    secondLargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]>secondLargest && arr[i]!=largest)
                {
                    secondLargest=arr[i];
                }
            }
        }
        if(secondLargest==Integer.MIN_VALUE)
        {
            System.out.println("No second largest divisible by "+k+" found.");
        }
        else
        {
            System.out.println("Second largest divisible by "+k+": "+secondLargest);
        }
    }
}
