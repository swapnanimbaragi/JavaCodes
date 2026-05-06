import java.util.Scanner;

public class ReptInTwoSortedArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int a2[]=new int[n2];
        for(int j=0;j<n2;j++)
        {
            a2[j]=scanner.nextInt();
        }
        int i=0,j=0;
        while(j<a2.length && i<a.length)
        {
            if(a[i]==a2[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]>a2[j])
            {
                j++;
            }
            else{
                i++;
            }
        }
    }
}
