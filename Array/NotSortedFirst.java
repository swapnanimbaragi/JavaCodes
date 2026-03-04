import java.util.Scanner;
public class NotSortedFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                System.out.print(a[i+1]);
                return ;
            }

        }
        System.out.print(-1);

        
    }
}

