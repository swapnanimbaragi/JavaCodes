package Patterns.Array;

import java.util.Scanner;

public class Age {
    public static void main(String[] args)
    {
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
            // a[3]=60;
            System.out.println(a[i]);
        }
    }
}
    


