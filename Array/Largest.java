package Codes.Array;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the ages" + i);
            a[i]=scan.nextInt();
        }
        System.out.println(" largest Ages");
        int max=a[0];
        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

