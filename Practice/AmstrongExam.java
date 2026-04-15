package Practice;
import java.util.*;
public class AmstrongExam
{
    public static boolean isAmstrong(int num)
    {
        int temp=num;
        int digits=0;
        int sum=0;

        int n=num;
        while(n>0)
        {
            digits++;
            n=n/10;

        }
        
        n=num;
        while(n>0)
        {
            int digit=n%10;
            sum+=(int)Math.pow(digit,digits);
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            if(isAmstrong(a[i]))
            {
                System.out.print(a[i]+" ");

            }
        }
    }
}