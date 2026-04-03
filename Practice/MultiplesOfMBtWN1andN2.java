package Practice;
import java.util.*;
public class MultiplesOfMBtWN1andN2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m=sc.nextInt();
        System.out.println("Enter a range n1 and n2");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1; i<=n2; i++)
        {
            if(i%m==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
