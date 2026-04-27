package Practice;
import java.util.*;
public class PerfectSquareCheck {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scan.nextInt();
        int root=(int)Math.sqrt(n);
        if(root*root==n)
        {
            System.out.print("Perfect Square");
        }
        else{
            System.out.print("Not Perfect Square");
        }
    }
}
