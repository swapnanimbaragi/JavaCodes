package Practice;
import java.util.*;
public class MultiplesOfMBtWN1andN2 {
    public static void main(Strig[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
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
