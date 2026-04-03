package Practice;
import java.util.*;
public class FactorialOfN 
{
    
    public static int factorial(int n)
    {
        int factorial=1;
        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }
}
