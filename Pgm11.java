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

    static void numCtringle()
    {
        int n=5;
        
        for(int i=0;i<=n;i++)
        {
            int count=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(count++ +  " ");
            }
            System.out.println();
        }
    }
    static void numRtringle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print(count++ +  " ");
            }
            System.out.println();
        }
    }

    static void numHTringle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int j=1;j<=(n-i)+1;j++)
            {
                if(i==1 || j==1 || j==(n-i)+1)
                {
                    System.out.print(count++ + " ");
                }
                else
                {
                    System.out.print( "  "); 
                }
            }
            System.out.println();
        }
    }

    static void oddStar()
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    static void oddNumline()
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=(2*i)-1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void oddperamidS()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1; j++)
            {
                System.out.print("*" + " ");
            }
               
            System.out.println();
        }
    }

     static void numRectacgle()
    {
        int n=5;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)
                {
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }

         static void numdigoRectacgle()
    {
        int n=5;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(i+1 + " ");
                }
                else{
                    System.out.print("1" + " ");
                }
            }
            System.out.println();
            
        }
    }

    static void Holocode()
    {
    for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0 || i==4 || j==0 || j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void numincrdecr()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=1;
            for(int j=1;j<=(2*i)-1;j++)
            {
                if(j<i) 
                {
                    System.out.print(count++ + " ");
                }
                else{
                    System.out.print(count-- + " ");
                }
                
            }
            System.out.println();
        }
    }

    static void numperaincrdecr()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=1;
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                if(j<i)
                {
                    System.out.print(count++ + " ");
                }
                else{
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }

    static void pgm()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i % 2==0)
            {
                System.out.print(i+1 + " ");
            }
            
            for(int j=1;j<=n;j++)
            {
                System.out.print(i + " ");
            }
            if(i % 2 !=0)
            {
                System.out.print(i+1 + " ");
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
        System.out.println();
        numCtringle();
        System.out.println();
        numRtringle();
        System.out.println();
        numHTringle();
        System.out.println();
        oddStar();
        System.out.println();
        oddNumline();
        System.out.println();
        oddperamidS();
        System.out.println();
        numRectacgle();
        System.out.println();
        numdigoRectacgle();
        System.out.println();
        Holocode();
        System.out.println();
        numincrdecr();
        System.out.println();
        numperaincrdecr();
        System.out.println();
        pgm();

    }
}