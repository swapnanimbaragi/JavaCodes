package Patterns.math;

import java.util.Scanner;

public class Day2 
{
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

}
