package Codes.PatternsProgram;

public class OtherallPatternprgms 
{
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

    static void pgm1()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(n-i + " ");
            }
            System.out.println();
        }
    }
    static void pgm3()
    {
        int n=5;
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void pgm4()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i*(i+1)/2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count-j+1 + " ");
            }
            System.out.println();
        }
    }
    
        static void pgm5()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int count=i*(i+1)/2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count-j+1 + " ");
                if(j<=i-1) 
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pgm6()
    {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    static void pgm7()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
    

     static void pgm8()
     {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
     }

     static void pgm9()
     {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2==0)
                {
                    System.out.print("1" + " ");
                }
                else
                {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
     }

     static void pgm10()
     {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1" + " ");
                }
                else
                {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
     }

      static void pgm11()
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
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
            
        }
    }

    static void pgm12()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            
            for(int j=n-i+1;j<=n;j++)
            {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }

    static void pgm13()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            
            for(int j=n-i+1;j<=n;j++)
            {
                System.out.print(i + " ");
            }
        System.out.println();
        }
    }

     static void pgm14()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " " );
            }
        System.out.println();
        }
    }

    static void Holodigonal()
    {
    int n=5;
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if( i+j==n+1 || i==1 || i==n || j==1 || j==n )
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

    static void Holobothsdigonal()
    {
    int n=5;
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if( i+j==n+1 || i==1 || i==n || j==1 || j==n || i==j )
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

    static void pgm16()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i)+1;k++)
            {
                System.out.print("$ ");
            }
            
            System.out.println();
        }
    }
    
        static void pgm17()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("$ ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

            static void pgm18()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("$ ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+j -1 + " ");
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
        System.out.println();
        pgm1();
        System.out.println();
        pgm3();
        System.out.println();
        pgm4();
        System.out.println();
        pgm5();
        System.out.println();
        pgm6();
        System.out.println();
        pgm7();
        System.out.println();
        pgm8();
        System.out.println();
        pgm9();
        System.out.println();
        pgm10();
        System.out.println();
        pgm11();
        System.out.println();
        pgm12();
        System.out.println();
        pgm13();
        System.out.println();
        pgm14();
        System.out.println();
        Holodigonal();
        System.out.println();
        Holobothsdigonal();
        System.out.println();
        pgm16();
        System.out.println();
        pgm17();
        System.out.println();
        pgm18();

    }
}

