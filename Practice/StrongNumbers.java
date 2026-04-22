package Practice;
import java.util.*;
public class StrongNumbers {
    public static int isFactorial (int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int original=n;
        while(n>0)
        {
            int digit=n%10;

        }
    }
}
