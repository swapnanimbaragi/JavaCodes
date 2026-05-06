package Practice;
import java.util.*;
public class MargeTwoArrayExam {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int res[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            res[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            
            res[i+a.length]=b[i];
        }
        for(int i=0;i<res.length;i++)
        {
            if(res[i]%2!=0)
            System.out.print(res[i]+" ");
        }
        // for(int i=res.length-1;i>=0;i--)
        // {
        //     if(res[i]%2!=0)
        //     {
        //         System.out.print(res[i]+" ");
        //     }
        // }



    }
}