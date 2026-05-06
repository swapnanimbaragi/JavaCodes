import java.util.Scanner;
public class Kthlargestelem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=scanner.nextInt();
        System.out.print("Enter the elements: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            largest=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                if(a[j]>largest)
                {
                    largest=a[j];
                }

            }
            for(int j=0;j<n;j++)
            {
                if(a[j]==largest)
                {
                    a[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        System.out.print(largest);
    }
}

