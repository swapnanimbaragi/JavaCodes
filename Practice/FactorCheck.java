package Practice;
import java.util.*;
public class FactorCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        if(M%N==0)
        {
            System.out.println(N+" is a factor of "+M);
        }
        else
        {
            System.out.println(N+" is not a factor of "+M);
        }
    }
}
