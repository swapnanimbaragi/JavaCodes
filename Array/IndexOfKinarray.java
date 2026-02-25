
import java.util.Scanner;

public class IndexOfKinarray {
    public static int IndexOfK(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=scan.nextInt();
        System.out.println("Enter the array Number");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter K value");
        int k=scan.nextInt();
        int index=IndexOfK(a,k);
        if(index==-1)
        {
            System.out.println("K is not found in the array");
        }
        else
        {
            System.out.println("Index of K is "+index);
        }
    }
}
