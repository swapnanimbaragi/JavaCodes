package Codes.math;

import java.util.Scanner;

public class Counter 
{
    static int countofdigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Number of digits in " + n + " is: " + countofdigit(n));
    }
}
