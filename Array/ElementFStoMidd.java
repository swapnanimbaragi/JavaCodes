import java.util.*;

public class ElementFStoMidd 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Entered Mid Elements");
        for(int i=0;i<n/2;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
