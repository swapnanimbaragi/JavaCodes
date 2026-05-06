package Practice;
import java.util.*;
public class AllPairDiffernce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int diff=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    diff=a[i]-a[j];
                }
                else{
                    diff=a[j]-a[i];
                }
                System.out.print(diff+" ");
            }
        }
    }
}
