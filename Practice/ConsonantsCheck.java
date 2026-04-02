package Practice;
import java.util.*;
public class ConsonantsCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=65 && n<=90 || n>=97 && n<=122)
        {
            if(!(n==65 || n==69 || n==73 || n==79 || n==85 || n==97 || n==101 || n==105 || n==111 || n==117))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
