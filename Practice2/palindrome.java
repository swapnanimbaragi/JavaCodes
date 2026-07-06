import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(int n)
    {
        int original=n;
        int reverse=0;
        while(n>0)
        {
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return original==reverse;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int size=1;size<n;size++)
        {
            for(int i=0;i<n-size;i++)
            {
                for(int j=i;j<i+size;j++)
                {
                    if(isPalindrome(a[j]))
                    {
                        System.out.print(a[j]+" ");
                    }
                }
            }
        }
        
    }
}
