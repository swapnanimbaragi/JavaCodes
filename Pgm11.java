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
    
    static void equilateralHtringle()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0; k<(n-1)-i; k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i || i==(n-1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    static void numequltraltringle()
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
                System.out.print(j+1 + " " );
            }
        System.out.println();
        }
        
    }

    static void numHtringle()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0; k<(n-1)-i; k++)
            {
                System.out.print(" ");
            }
                for(int j=0; j<n; j++)
                {
                    if(j==0 || j==i || i==(n-1))
                    {
                        System.out.print(j+1 + " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println(); 
            }
        }
    

        
    public static void main(String[] args) {
        System.out.println();
        reversetringle(); 
        System.out.println(); 
        equilateraltringle(); 
        System.out.println(); 
        equilateralHtringle();
        System.out.println(); 
        numequltraltringle();
        System.out.println(); 
        numHtringle();
    }
}