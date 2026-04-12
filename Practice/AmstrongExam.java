package Practice;
import java.util.*;
public class AmstrongExam
{
    public static boolean isAmstrong(int n)
    {
        int arm=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int last=n%10;
            arm=arm+(int)Math.pow(last,count);
            n=n/10;
            return true;
        }
        return false;
        
    }



    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isAmstrong(n))
            {
                

            }
        }
    }
}