package Patterns;

public class Pgm11 {
    static void reversetringle()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<(n-1)-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }

       static void equilateraltringle()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<(n-1)-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* " );
            }
        System.out.println();
        }
        
    }
    

    public static void main(String[] args) {
        System.out.println();
        reversetringle(); 
        System.out.println(); 
        equilateraltringle();  
    }
}