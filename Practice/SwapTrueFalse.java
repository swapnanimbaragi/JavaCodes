package Practice;
import java.util.*;
public class SwapTrueFalse {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextBoolean();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==true)
            {
                System.out.print(false+" ");
            }
            else if(arr[i]==false)
            {
                System.out.print(true+" ");
            }
        }
        // System.out.println("Swapped values:");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println();
        // }
    }
}
