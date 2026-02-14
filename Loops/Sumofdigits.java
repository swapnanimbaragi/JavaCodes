package Patterns.Loops;

// import java.util.Scanner;

public class Sumofdigits {
      public static void main(String... args)
    {
        int n=10;
        int sum=0;
        // int num=5;
        // Scanner scan=new Scanner(System.in);
        // int num=scan.nextInt(); 
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
