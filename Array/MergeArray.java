import java.util.Scanner;
public class MergeArray 
{
    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1=scan.nextInt();
        int []a1=new int[n1];
        for(int i=0 ;i<a1.length;i++)
        {
            a1[i]=scan.nextInt();
        }
        
        int n2=scan.nextInt();
        int []a2=new int[n2];
        for(int j=0;j<a2.length;j++)
        {
            a2[j]=scan.nextInt();
        }
        int k=0;
        int res[]=new int[n1+n2];
        for(int i=0;i<a1.length;i++)
        {
            res[k++]=a1[i];
        }
        for(int j=0;j<a2.length;j++)
        {
            res[k++]=a2[j];
        }
        System.out.print("Merged array: ");
        for(int i=0;i<res.length ;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}