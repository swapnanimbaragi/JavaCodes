package Practice;
import java.util.*;
public class NumberIsPalndromeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int originalNum=n;
        int revNum=0;
        while(n>0)
        {
            int digit=n%10;
            revNum=revNum*10+digit;
            n=n/10;
        }
        // System.out.print(revNum);
        if(originalNum==revNum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
