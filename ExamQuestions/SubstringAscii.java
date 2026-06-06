package ExamQuestions;
import java.util.*;
public class SubstringAscii {
    public static boolean isPrime (int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isAmstrong(int n)
    {
        int original=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=Math.pow(digit,3);
            n/=10;
        }
        return sum==original;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<=s.length(); j++)
            {
                char ch=s.charAt(i);
                int ascii=(int)ch;
                if(isPrime(ascii) || isAmstrong(ascii))
                {
                    System.out.print(ch+" "+ascii);
                //     System.out.println("Yes");
                //     return;
                }
                else
                {
                    System.out.print("No");
                    return;
                }
            }
             
        }
       
    }
}
