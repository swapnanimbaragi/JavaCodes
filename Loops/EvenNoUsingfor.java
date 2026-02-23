import java.util.*;
public class EvenNoUsingfor {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        // for(int i=2;i<=n;i++,i++) or
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}
