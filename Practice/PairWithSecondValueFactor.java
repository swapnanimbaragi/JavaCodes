package Practice;
import java.util.Scanner;
public class PairWithSecondValueFactor {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        boolean foundPair=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]%arr[j]==0)
                {
                    System.out.println("Pair: ("+arr[i]+", "+arr[j]+")");
                    foundPair=true;
                }
            }
        }
        if(!foundPair)
        {
            System.out.println("No such pairs found.");
        }
    }
}
