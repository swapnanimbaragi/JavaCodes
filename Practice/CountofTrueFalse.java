package Practice;
import java.util.*;

public class CountofTrueFalse {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextBoolean();
        }
        int trueCount=0,falseCount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i])
            {
                trueCount++;
            }
            else
            {
                falseCount++;
            }
        }
        System.out.println("True count: "+trueCount);
        System.out.println("False count: "+falseCount);
    }
}
