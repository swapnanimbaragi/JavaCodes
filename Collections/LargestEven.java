package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class LargestEven {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]%2==0)
        //     {
        //         evenNumbers.add(arr[i]);
        //     }
        // }
        // if(evenNumbers.isEmpty())
        // {
        //     System.out.println("No even number found.");
        // }
        // else
        // {
        //     int largest=evenNumbers.get(0);
        //     for(int i=1;i<evenNumbers.size();i++)
        //     {
        //         if(evenNumbers.get(i)>largest)
        //         {
        //             largest=evenNumbers.get(i);
        //         }
        //     }
        //     System.out.println("Largest even number: "+largest);
        // }
        int largestEven=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0 && arr[i]>largestEven)
            {
                largestEven=arr[i];
            }
        }   
        if(largestEven == Integer.MIN_VALUE)
        {
            System.out.println("No even number found.");
        }
        else
        {
            System.out.println("Largest even number: " + largestEven);
        }
    }
}
