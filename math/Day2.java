package Patterns.math;

import java.util.Scanner;

public class Day2 
{
    static void math( int n)
    {
    if(n%5==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    // Write your code here
    if(num%2==0)
    {
        System.out.print("Yes");
    }
    else
    {
        System.out.print("No");
    }
    }

     Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
}
