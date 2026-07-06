import java.util.*;
public class Unique {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        // Unique character in a string
        // String s=scan.nextLine();
        // int count=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     for(int j=0;j<s.length();j++)
        //     {
        //         if(s.charAt(i)==s.charAt(j))
        //         {
        //             count++;
        //         }
        //     }
        // }
        // if(count==1)
        // {
        //     System.out.println("Unique");
        // }
        // else
        // {
        //     System.out.println("Not Unique");
        // }

        // Amstrong number
        // int num=scan.nextInt();
        // int temp=num;
        // int count=0;
        // while(temp>0)
        // {
        //     temp=temp/10;
        //     count++;
        // }
        // temp=num;
        // int sum=0;
        // while(num>0)
        // {
        //     int digits=num%10;
        //     sum+=Math.pow(digits,count);
        //     num=num/10;
        // }
        // if(sum==temp)
        // {
        //     System.out.println("It is an Amstrong number");
        // }
        // else
        // {
        //     System.out.println("It is not an Amstrong number");
        // }

        // Prime Number
        // int n=scan.nextInt();
        // boolean prime=true;
        // if(n<=1)
        // {
        //     prime=false;
        // }
        // else
        // {
        //     for(int i=2;i<=n/2;i++)
        //     {
        //         if(n%i==0)
        //         {
        //             prime=false;
        //             break;
        //         }
        //     }
        // }
        // if(prime)
        // {
        //     System.out.println("It is a prime number");
        // }
        // else
        // {
        //     System.out.println("It is not a prime number");
        // }

        // palindrome number
        // int n=scan.nextInt();
        // int rev=0;
        // int temp=n;
        // while(n>0)
        // {
        //     int digit=n%10;
        //     rev=rev*10+digit;
        //     n=n/10;
        // }
        // if(rev==temp)
        // {
        //     System.out.println("It is a palindrome number");
        // }
        // else
        // {
        //     System.out.println("It is not a palindrome number");
        // }

        // Reverese digits of a number
        int n=scan.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);



    }
    
}
