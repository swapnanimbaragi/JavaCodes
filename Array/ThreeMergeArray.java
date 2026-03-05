import java.util.Scanner;
public class ThreeMergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int []a1=new int[n1];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int []a2=new int[n2];
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=scanner.nextInt();
        }
        int n3=scanner.nextInt();
        int []a3=new int[n3];
        for(int i=0;i<a3.length;i++)
        {
            a3[i]=scanner.nextInt();
        }
        int k=0;
        int res[]=new int[n1+n2+n3];
        for(int i=0;i<a1.length;i++)
        {
            res[k]=a1[i];
            k++;
        }
        for(int j=0;j<a2.length;j++)
        {
            res[k]=a2[j];
            k++;
        }
        for(int x=0;x<a3.length;x++)
        {
            res[k]=a3[x];
            k++;
        }
        System.out.print("Merged array: ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
