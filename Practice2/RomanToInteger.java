import java.util.Scanner;
public class RomanToInteger {
    public static int value(char ch)
    {
        if(ch=='I')
        {
            return 1;
        }
        else if(ch=='V')
        {
            return 5;
        }
        else if(ch=='X')
        {
            return 10;
        }
        else if(ch=='L')
        {
            return 50;
        }
        else if(ch=='C')
        {
            return 100;
        }
        else if(ch=='D')
        {
            return 500;
        }
        else if(ch=='M')
        {
            return 1000;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int current=value(s.charAt(i));
            if(i==s.length()-1)
            {
                sum=sum+current;
            }
            else
            {
                int next=value(s.charAt(i+1));
                if(current>=next)
                {
                    sum=sum+current;
                }
                else
                {
                    sum=sum-current;
                }
            }
        }
        System.out.println(sum);
    }
}
