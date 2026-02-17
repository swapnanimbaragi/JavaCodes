import java.util.Scanner;
public class Countfactors 
{
    static void factorscount(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter No");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        factorscount(n);
    }
}



