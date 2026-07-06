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
        int num=scan.nextInt();
        int temp=num;
        int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=num;
        int sum=0;
        while(num>0)
        {
            int digits=num%10;
            sum+=Math.pow(digits,count);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("It is an Amstrong number");
        }
        else
        {
            System.out.println("It is not an Amstrong number");
        }



    }
    
}
