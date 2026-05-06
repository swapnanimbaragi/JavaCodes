import java.util.*;
public class ThreeDarray {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array values");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        int a[][][]=new int [n1][n2][n3];
        System.out.println("array values");
        for(int k=0;k<n1;k++)
        {
            for(int i=0;i<n2;i++)
            {
                for(int j=0;j<n3;j++)
                {
                    System.out.println("enter " +  i + " row " + j + " column");
                    a[k][i][j]=scan.nextInt();
                }
            }
        }
        for(int k=0;k<n1;k++)
        {
            for(int i=0;i<n2;i++)
            {
                for(int j=0;j<n3;j++)
                {
                    // System.out.println("entered " +  i + " row " + j + " column");
                    System.out.print(a[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
