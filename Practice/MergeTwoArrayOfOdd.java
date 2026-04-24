package Practice;
import java.util.*;
public class MergeTwoArrayOfOdd
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=scanner.nextInt();
        }
        int res[]=new int[a.length+b.length];
        for(int i=0;i<n;i++)
        {
            res[i]+=a[i];
        }
        for(int i=0;i<m;i++)
        {
            res[i+a.length]+=b[i];
        }
        for(int i = 0; i < res.length - 1; i++) 
        { 
            for(int j = 0; j < res.length - i - 1; j++) 
            { 
                if(res[j] > res[j + 1]) 
                { 
                    int temp = res[j]; 
                    res[j] = res[j + 1]; 
                    res[j + 1] = temp; 
                }
            }
        }
        for(int i=0;i<res.length;i++)
        {
            // Arrays.sort(res);
            if(res[i]%2 != 0)
            {
                System.out.print(res[i]+" ");
            }
        }

    }
}