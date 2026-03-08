import java.util.Scanner;

public class EndRearrange1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int i=0;
        int j=0;
        while(i<a.length)
        {
            if(a[i]==-1)
            {
                i++;
            }
            else
            {
                a[j]=a[i];
                i++;
                j++;
            }
        }
        while(j<a.length)
        {
            a[j]=-1;
            j++;
        }
        for(int x=0;x<a.length;x++)
        {
            System.out.print(a[x]+" ");
        }
    
    }
}
