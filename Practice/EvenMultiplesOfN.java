package Practice;
import java.util.*;
public class EvenMultiplesOfN 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
            if(i%n==0 && i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
