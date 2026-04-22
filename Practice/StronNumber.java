package Practice;
import java.util.*;
public class StronNumber {
    public static int isFactorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    } 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int original=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=isFactorial(digit);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.print("Strong Number");
        }
        else{
            System.out.print("Not Strong Number");
        }
        
    }
}
