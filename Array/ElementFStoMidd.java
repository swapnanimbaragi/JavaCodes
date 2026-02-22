import java.util.*;

public class ElementFStoMidd 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        // int mid=0;
        for(int i=0;i<n/2;i++)
        {
            // mid=i%2==0;
            System.out.println(a[i]);
        }
    }
    
}
