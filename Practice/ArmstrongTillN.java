package Practice;
import java.util.*;
public class ArmstrongTillN {
    public static boolean isArmstrong(int n)
    {
        int count= String.valueOf(n).length();
        int original=n;
        int arm=0;
        while(n>0)
        {
            int last= n%10;
            arm= arm + (int)Math.pow(last, count);
            n=n/10;
        }
        return arm==original;
    }


    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
