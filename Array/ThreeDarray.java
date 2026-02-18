import java.util.*;
public class ThreeDarray {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array values");
        int a[][][]=new int [2][3][5];
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<5;j++)
                {
                    a[k][i][j]=scan.nextInt();
                }
            }
        }
        System.out.println("array values");
        for(int k=0;k<2;k++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.println("entered " +  i + " row " + j + " column");
                    System.out.print(a[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
