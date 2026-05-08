package Practice;
import java.util.Scanner;
public class secondsmallestOdd {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                if(arr[i]<smallest)
                {
                    secondSmallest=smallest;
                    smallest=arr[i];
                }
                else if(arr[i]<secondSmallest && arr[i]!=smallest)
                {
                    secondSmallest=arr[i];
                }
            }
        }
        if(secondSmallest==Integer.MAX_VALUE)
        {
            System.out.println("No second smallest odd number found.");
        }
        else
        {
            System.out.println("Second smallest odd number: "+secondSmallest);
        }
    }
}
