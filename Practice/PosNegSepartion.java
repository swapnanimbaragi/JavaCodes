package Practice;
import java.util.Scanner;


public class PosNegSepartion {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Positive numbers:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\nNegative numbers:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
