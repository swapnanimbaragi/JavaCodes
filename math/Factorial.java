package Codes.math;

import java.util.Scanner;

public class Factorial {
    static int fact(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result =(result * i);
        }
        return result;

    }
    public static void main(String...args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Factorial"+fact(n));
    }
}
