import java.util.Scanner;
public class PrimebtwNM 
{
    static boolean checkprime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNPrimes(n);
        
    }
    

    public static void printFirstNPrimes(int n) 
    {
        // Your code to print the first 'n' prime numbers goes here

        int count=0;
        for(int i=2;count<n;i++)
        {
            if(checkprime(i))
            {
                System.out.print(i + " ");
                count++;
            }

            
        }
    }
}
