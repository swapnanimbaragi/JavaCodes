import java.util.Scanner;

public class PairPrime {
     public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%1==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
       
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(isPrime(a[i]) || isPrime(a[j]))
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }

    }
}

