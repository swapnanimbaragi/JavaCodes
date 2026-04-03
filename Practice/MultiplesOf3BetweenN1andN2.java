package Practice;
import java.util.*;
public class MultiplesOf3BetweenN1andN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1; i<=n2; i++)
        {
            if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
