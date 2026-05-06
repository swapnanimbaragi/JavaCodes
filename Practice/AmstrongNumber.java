package Practice;
import java.util.*;
public class AmstrongNumber {
    public static boolean isAmstrong(int n)
    {
        int count = String.valueOf(n).length();
        int original=n;
        int arm = 0;
        while (n > 0) 
        {
            int last= n % 10;
            arm = arm + (int)Math.pow(last, count);
            n = n/ 10;
        }
        return arm==original;

    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(isAmstrong(n))
        {
            System.out.println(n +" is an Amstrong number.");
        }
        else
        {
            System.out.println(n +" is not an Amstrong number.");  
        }

    }
}
