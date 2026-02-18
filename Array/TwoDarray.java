// package Codes.Array;
import java.util.*;
public class TwoDarray {
    public static void main(String[] args)
    {
        int a[][]=new int [2][5];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                // System.out.println("entere " +  i + " row " + j + " column");
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("values");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                // System.out.println("entered " +  i + " row " + j + " column");
                System.out.print(a[i][j] + " ");

                // System.out.println(a[1][j]);
            }
        }
    }
}
