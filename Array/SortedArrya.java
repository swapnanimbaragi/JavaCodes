import java.util.*;
public class SortedArrya 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                sorted=false;
                break;
            }
           
        }
        if(sorted)
        {
            System.out.println("Sorted");

        }
        else
        {
            System.out.println("not sorted");
        }
    }
}
    

