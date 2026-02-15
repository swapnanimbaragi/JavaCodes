package Patterns.Array;

import java.util.Scanner;

public class Sumage {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the ages" + i);
            a[i]=scan.nextInt();
        }
        System.out.println("Ages");
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
            
        }
        System.out.println(sum);
    }
}

