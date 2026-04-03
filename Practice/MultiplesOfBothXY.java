package Practice;
import java.util.*;    
public class MultiplesOfBothXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and a range");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1; i<=n2; i++)
        {
            if(i%x==0 && i%y==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
