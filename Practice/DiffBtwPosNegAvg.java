package Practice;
import java.util.Scanner;
public class DiffBtwPosNegAvg 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int posSum=0,posCount=0,negSum=0,negCount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                posSum+=arr[i];
                posCount++;
            }
            else if(arr[i]<0)
            {
                negSum+=arr[i];
                negCount++;
            }
        }
        double posavg=(double)(posSum)/posCount;
        double negavg=(double)(negSum)/negCount;
        double diff=posavg-negavg;
        System.out.printf("%.2f", diff);
    }
}