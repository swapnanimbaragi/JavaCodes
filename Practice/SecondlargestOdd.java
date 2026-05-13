package Practice;
import java.util.Scanner;
public class SecondlargestOdd {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
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
            System.out.println("No second largest odd number found.");
        }
        else
        {
            System.out.println("Second largest odd number: "+secondLargest);
        }
    }
    
}
