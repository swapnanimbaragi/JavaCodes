package Practice;
import java.util.Scanner;

public class Armstrongnum {
    public static boolean isArmstrong(int num)
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
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }


    }
}
