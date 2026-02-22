import java.util.*;
public class SumofmidElem 
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
        int sum=0;
        for(int i=0;i<n/2;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }    
}
