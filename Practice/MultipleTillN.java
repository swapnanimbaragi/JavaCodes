package Practice;
import java.util.*;
public class MultipleTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n; i<=m; i++)
        {
            if(i%n==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
