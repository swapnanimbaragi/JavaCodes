package Practice;

public class PatternPrintingZ {
    public static void main(String [] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<(n-1)-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=i;j++)
            {
                
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
        }
        

    }
}
